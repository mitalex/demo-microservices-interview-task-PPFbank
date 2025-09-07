package org.acme.dto;

public class CounterPartyAccountDto {

    private String accountName;
    private String accountNumber;
    private String bankCode;

    public CounterPartyAccountDto(String accountName, String accountNumber, String bankCode) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankCode = bankCode;
    }

    // Getters and setters

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
}
