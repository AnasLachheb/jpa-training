package pl.jrola.training.jpa.safari.ex6.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="ex6.account")
@Table(name = "TEST.ACCOUNT")
public class Account {

    @Id
    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    @Column(name = "BANK_ID")
    private String bankId;

    @Column(name = "ACCOUNT_TYPE")
    private String accountType;

    @Column(name = "NAME")
    private String name;

    @Column(name = "INITIAL_BALANCE")
    private Double initialBalance;

    @Column(name = "CURRENT_BALANCE")
    private Double currentBalance;

    @Column(name = "OPEN_DATE")
    private Date openDate;

    @Column(name = "CLOSE_DATE")
    private Date closeDate;

    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATED_DATE")
    private Date lastUpdatedDate;

    @Column(name = "CREATED_BY")
    private String creadedBy;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @OneToMany
    @JoinColumn(name = "ACCOUNT_ID")
    private List<Transaction> transactions;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getCreadedBy() {
        return creadedBy;
    }

    public void setCreadedBy(String creadedBy) {
        this.creadedBy = creadedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getBank() {
        return bankId;
    }

    public void setBank(String account) {
        this.bankId = account;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", bankId='" + bankId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", name='" + name + '\'' +
                ", initialBalance=" + initialBalance +
                ", currentBalance=" + currentBalance +
                ", openDate=" + openDate +
                ", closeDate=" + closeDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", creadedBy='" + creadedBy + '\'' +
                ", createdDate=" + createdDate +
                ", transactions=" + transactions +
                '}';
    }
}