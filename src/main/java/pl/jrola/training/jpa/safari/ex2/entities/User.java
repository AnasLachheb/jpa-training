package pl.jrola.training.jpa.safari.ex2.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name="ex2.User")
@Table(name = "FINANCES_USER")
public class User {

	@Id
	@Column(name = "USER_ID")
	private Long userId;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "LAST_UPDATED_DATE")
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE", updatable = false)
	private Date createdDate;

	@Column(name = "CREATED_BY", updatable = false)
	private String createdBy;

	@Embedded
	private Name name;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"userId=" + userId +
				", birthDate=" + birthDate +
				", emailAddress='" + emailAddress + '\'' +
				", lastUpdatedDate=" + lastUpdatedDate +
				", lastUpdatedBy='" + lastUpdatedBy + '\'' +
				", createdDate=" + createdDate +
				", createdBy='" + createdBy + '\'' +
				", name=" + name +
				'}';
	}
}
