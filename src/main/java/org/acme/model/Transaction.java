package org.acme.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trxId")
    private Long trxId;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "currency", nullable = false, length = 3)
    private String currency;

    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "bankref", nullable = false, length = 20)
    private String bankref;

    @Column(name = "transactionId", nullable = false, length = 20)
    private String transactionId;

    @Column(name = "bookingDate")
    private LocalDate bookingDate;

    @Column(name = "postingDate", nullable = false)
    private LocalDate postingDate;

    @Column(name = "creditDebitIndicator", length = 4)
    private String creditDebitIndicator;

    @Column(name = "ownAccountNumber", length = 20)
    private String ownAccountNumber;

    @ManyToOne
    @JoinColumn(name = "counterPartyAccount", nullable = false)
    private Account counterPartyAccount;

    @Column(name = "detail1", length = 50)
    private String detail1;

    @Column(name = "detail2", length = 50)
    private String detail2;

    @Column(name = "detail3", length = 50)
    private String detail3;

    @Column(name = "detail4", length = 50)
    private String detail4;

    @Column(name = "productBankRef", length = 50)
    private String productBankRef;

    @ManyToOne
    @JoinColumn(name = "transactionType", nullable = false)
    private TransactionType transactionType;

    @ManyToOne
    @JoinColumn(name = "statement", nullable = false)
    private Statement statement;

    @Column(name = "constantSymbol", length = 10)
    private String constantSymbol;

    @Column(name = "specificSymbol", length = 10)
    private String specificSymbol;

    @Column(name = "variableSymbol", length = 10)
    private String variableSymbol;

    // Getters and setters

    public Long getTrxId() {
        return trxId;
    }

    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankref() {
        return bankref;
    }

    public void setBankref(String bankref) {
        this.bankref = bankref;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(LocalDate postingDate) {
        this.postingDate = postingDate;
    }

    public String getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(String creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public String getOwnAccountNumber() {
        return ownAccountNumber;
    }

    public void setOwnAccountNumber(String ownAccountNumber) {
        this.ownAccountNumber = ownAccountNumber;
    }

    public Account getCounterPartyAccount() {
        return counterPartyAccount;
    }

    public void setCounterPartyAccount(Account counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public String getDetail1() {
        return detail1;
    }

    public void setDetail1(String detail1) {
        this.detail1 = detail1;
    }

    public String getDetail2() {
        return detail2;
    }

    public void setDetail2(String detail2) {
        this.detail2 = detail2;
    }

    public String getDetail3() {
        return detail3;
    }

    public void setDetail3(String detail3) {
        this.detail3 = detail3;
    }

    public String getDetail4() {
        return detail4;
    }

    public void setDetail4(String detail4) {
        this.detail4 = detail4;
    }

    public String getProductBankRef() {
        return productBankRef;
    }

    public void setProductBankRef(String productBankRef) {
        this.productBankRef = productBankRef;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public String getConstantSymbol() {
        return constantSymbol;
    }

    public void setConstantSymbol(String constantSymbol) {
        this.constantSymbol = constantSymbol;
    }

    public String getSpecificSymbol() {
        return specificSymbol;
    }

    public void setSpecificSymbol(String specificSymbol) {
        this.specificSymbol = specificSymbol;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }
}