package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "transactionType")
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trxTypeId")
    private Long trxTypeId;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "code", nullable = false)
    private int code;

    // Getters and setters

    public Long getTrxTypeId() {
        return trxTypeId;
    }

    public void setTrxTypeId(Long trxTypeId) {
        this.trxTypeId = trxTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}