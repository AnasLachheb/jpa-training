package pl.jrola.training.jpa.safari.ex3.entities;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "ex3.BANK")
@Table(name = "BANK")
public class Bank {

	@Id
	@Column(name = "BANK_ID")
	private Long bankId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "IS_INTERNATIONAL")
	private boolean international;

	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@ElementCollection
	@CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(name = "BANK_ID"))
	@Column(name="NAME")
	private List<String> contacts;

	@ElementCollection
	@CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(name = "BANK_ID"))
	private List<BankContact> bankContacts;

    @ElementCollection
    @CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(name = "BANK_ID"))
    @MapKeyColumn(name="POSITION_TYPE")
    @Column(name="NAME")
    private Map<String, String> mapContacts;

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInternational() {
		return international;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	public List<BankContact> getBankContacts() {
		return bankContacts;
	}

	public void setBankContacts(List<BankContact> bankContacts) {
		this.bankContacts = bankContacts;
	}

    public Map<String, String> getMapContacts() {
        return mapContacts;
    }

    public void setMapContacts(Map<String, String> mapContacts) {
        this.mapContacts = mapContacts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankId=" + bankId +
                ", name='" + name + '\'' +
                ", international=" + international +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
                ", contacts=" + contacts +
                ", bankContacts=" + bankContacts +
                ", mapContacts=" + mapContacts +
                '}';
    }
}