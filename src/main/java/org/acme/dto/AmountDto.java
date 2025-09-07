package org.acme.dto;

import java.math.BigDecimal;

public class AmountDto {

    private String currency;
    private BigDecimal value;

    public AmountDto(String currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    // Getters and setters

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
