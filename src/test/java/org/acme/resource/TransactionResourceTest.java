package org.acme.resource;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jakarta.inject.Inject;
import org.acme.model.Account;
import org.acme.model.Statement;
import org.acme.model.Transaction;
import org.acme.model.TransactionType;
import org.acme.repository.TransactionRepository;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import jakarta.inject.Inject;

@QuarkusTest
class TransactionResourceTest {

    @InjectMock
    TransactionRepository transactionRepository;

    @Test
    void getTransactions_whenAccountHasTransactions_shouldReturnTransactionList() {
        // Arrange
        String accountNumber = "2002222222";
        var now = LocalDate.now();

        Transaction tx1 = new Transaction();
        tx1.setOwnAccountNumber(accountNumber);
        tx1.setAmount(new BigDecimal("1500"));
        tx1.setCurrency("CZK");
        TransactionType transactionType = new TransactionType();
        transactionType.setType("DEBIT");
        transactionType.setCode(1);
        transactionType.setTrxTypeId(1L);
        tx1.setTransactionType(transactionType);
        tx1.setBookingDate(now);
        Account counterPartyAccount = new Account();
        counterPartyAccount.setName("PPF BANKA A.S.");
        counterPartyAccount.setNumber("0000009504010019");
        counterPartyAccount.setCode("6000");
        tx1.setCounterPartyAccount(counterPartyAccount);
        Statement statement = new Statement();
        statement.setStatementId(1L);
        tx1.setStatement(statement);

        List<Transaction> transactions = List.of(tx1, tx1);

        when(transactionRepository.findByAccountNumber(accountNumber)).thenReturn(transactions);

        // Act & Assert
        given()
                .when()
                .get("/accounts/{accountNumber}/transactions", accountNumber)
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("size()", is(2))
                .body("[0].amount.value", is(1500)) // REST Assured parses JSON numbers as float by default
                .body("[0].bookingDate", is(now.toString()));
    }

    @Test
    void getTransactions_whenAccountHasNoTransactions_shouldReturnEmptyList() {
        // Arrange
        String accountNumber = "0987654321";
        when(transactionRepository.findByAccountNumber(accountNumber)).thenReturn(Collections.emptyList());

        // Act & Assert
        given().when().get("/accounts/{accountNumber}/transactions", accountNumber).then().statusCode(200)
                .contentType(ContentType.JSON).body("size()", is(0));
    }

}