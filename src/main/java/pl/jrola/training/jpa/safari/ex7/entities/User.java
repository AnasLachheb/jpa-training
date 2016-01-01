package pl.jrola.training.jpa.safari.ex7.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="ex7.User")
@Table(name = "FINANCES_USER")
public class User {

	@Id
	@Column(name = "USER_ID")
    @Getter
    @Setter
	private Long userId;

	@Column(name = "FIRST_NAME")
    @Getter
    @Setter
	private String firstName;

	@Column(name = "LAST_NAME")
    @Getter
    @Setter
	private String lastName;

	@Column(name = "BIRTH_DATE")
    @Getter
    @Setter
	private Date birthDate;

	@Column(name = "EMAIL_ADDRESS")
    @Getter
    @Setter
	private String emailAddress;

	@Column(name = "LAST_UPDATED_DATE")
    @Getter
    @Setter
	private Date lastUpdatedDate;

	@Column(name = "LAST_UPDATED_BY")
    @Getter
    @Setter
	private String lastUpdatedBy;

	@Column(name = "CREATED_DATE", updatable = false)
    @Getter
    @Setter
	private Date createdDate;

	@Column(name = "CREATED_BY", updatable = false)
    @Getter
    @Setter
	private String createdBy;

    @ManyToMany(mappedBy = "users")
    @Getter
    @Setter
    private List<Account> accounts;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", emailAddress='" + emailAddress + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", createdDate=" + createdDate +
                ", createdBy='" + createdBy + '\'' +
//                ", accounts=" + accounts +
                '}';
    }
}
