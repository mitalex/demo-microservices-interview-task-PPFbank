package org.acme.resource;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static io.restassured.RestAssured.given;

@QuarkusTest
class TransactionResourceWithDBVsFixturesTest {


    @Test
    void getTransactions_whenAccountHasTransactions_shouldReturnExpectedTransactionList() throws IOException, JSONException {

        Response response = given()
                .when()
                .get("/accounts/{accountNumber}/transactions", "2002222222")
                .then().statusCode(200)
                .extract().response();
        String actualJson = response.getBody().asString();

        // load expected JSON from file
        String expectedJson = Files.readString(
                Path.of("src/test/resources/ta-2002222222-transactions-response.json")
        );

        // strict comparison: structure + values must match
        JSONAssert.assertEquals(expectedJson, actualJson, true);


    }

}