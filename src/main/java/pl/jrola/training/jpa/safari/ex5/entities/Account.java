package pl.jrola.training.jpa.safari.ex5.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ACCOUNT")
public class Account {

	@Id
	@Column(name="ACCOUNT_ID")
	private Long accountId;

	@ManyToOne
	@JoinColumn(name = "BANK_ID")
	private Bank bank;

	@Column(name="ACCOUNT_TYPE")
	private String accountType;

	@Column(name="NAME")
	private String name;

	@Column(name="INITIAL_BALANCE")
	private Double initialBalance;

	@Column(name="CURRENT_BALANCE")
	private Double currentBalance;

	@Column(name="OPEN_DATE")
	private Date openDate;

	@Column(name="CLOSE_DATE")
	private Date closeDate;

	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name="CREATED_BY")
	private String creadedBy;

	@Column(name="CREATED_DATE")
	private Date createdDate;

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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank account) {
		this.bank = account;
	}

	@Override
	public String toString() {
		return "Account{" +
				"accountId='" + accountId + '\'' +
				", bankId=" + bank.getBankId() +
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
				'}';
	}
}