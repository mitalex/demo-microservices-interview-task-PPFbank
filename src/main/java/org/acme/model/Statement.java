package org.acme.model;

import jakarta.persistence.*;

@Entity
@Table(name = "statement")
public class Statement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statementId")
    private Long statementId;

    @Column(name = "number", nullable = false, length = 20)
    private String number;

    @Column(name = "period", nullable = false, length = 20)
    private String period;

    @Column(name = "description", length = 1000)
    private String description;

    // Getters and setters

    public Long getStatementId() {
        return statementId;
    }

    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}