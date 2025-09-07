package org.acme.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionDto {

    private AmountDto amount;
    private String bankref;
    private LocalDate bookingDate;
    private CounterPartyAccountDto counterPartyAccount;
    private String creditDebitIndicator;
    private DetailsDto details;
    private String id;
    private String ownAccountNumber;
    private LocalDate postingDate;
    private String productBankRef;
    private String specificSymbol;
    private String statementNumber;
    private String statementPeriod;
    private String transactionId;
    private String transactionType;
    private int transactionTypeCode;
    private String variableSymbol;

    // Getters and setters

    public AmountDto getAmount() {
        return amount;
    }

    public void setAmount(AmountDto amount) {
        this.amount = amount;
    }

    public String getBankref() {
        return bankref;
    }

    public void setBankref(String bankref) {
        this.bankref = bankref;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public CounterPartyAccountDto getCounterPartyAccount() {
        return counterPartyAccount;
    }

    public void setCounterPartyAccount(CounterPartyAccountDto counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public DetailsDto getDetails() {
        return details;
    }

    public void setDetails(DetailsDto details) {
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwnAccountNumber() {
        return ownAccountNumber;
    }

    public void setOwnAccountNumber(String ownAccountNumber) {
        this.ownAccountNumber = ownAccountNumber;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public String getProductBankRef() {
        return productBankRef;
    }

    public void setProductBankRef(String productBankRef) {
        this.productBankRef = productBankRef;
    }

    public String getSpecificSymbol() {
        return specificSymbol;
    }

    public void setSpecificSymbol(String specificSymbol) {
        this.specificSymbol = specificSymbol;
    }

    public String getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(String statementNumber) {
        this.statementNumber = statementNumber;
    }

    public String getStatementPeriod() {
        return statementPeriod;
    }

    public void setStatementPeriod(String statementPeriod) {
        this.statementPeriod = statementPeriod;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTransactionTypeCode() {
        return transactionTypeCode;
    }

    public void setTransactionTypeCode(int transactionTypeCode) {
        this.transactionTypeCode = transactionTypeCode;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }
}
