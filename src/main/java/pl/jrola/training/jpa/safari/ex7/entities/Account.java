package pl.jrola.training.jpa.safari.ex7.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="ex7.account")
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @Column(name = "ACCOUNT_ID")
    @Getter
    @Setter
    private Long accountId;

    @Column(name = "BANK_ID")
    @Getter
    @Setter
    private String bankId;

    @Column(name = "ACCOUNT_TYPE")
    @Getter
    @Setter
    private String accountType;

    @Column(name = "NAME")
    @Getter
    @Setter
    private String name;

    @Column(name = "INITIAL_BALANCE")
    @Getter
    @Setter
    private Double initialBalance;

    @Column(name = "CURRENT_BALANCE")
    @Getter
    @Setter
    private Double currentBalance;

    @Column(name = "OPEN_DATE")
    @Getter
    @Setter
    private Date openDate;

    @Column(name = "CLOSE_DATE")
    @Getter
    @Setter
    private Date closeDate;

    @Column(name = "LAST_UPDATED_BY")
    @Getter
    @Setter
    private String lastUpdatedBy;

    @Column(name = "LAST_UPDATED_DATE")
    @Getter
    @Setter
    private Date lastUpdatedDate;

    @Column(name = "CREATED_BY")
    @Getter
    @Setter
    private String creadedBy;

    @Column(name = "CREATED_DATE")
    @Getter
    @Setter
    private Date createdDate;

    @ManyToMany
    @JoinTable(name = "USER_ACCOUNT", joinColumns=@JoinColumn(name="ACCOUNT_ID"),
            inverseJoinColumns=@JoinColumn(name="USER_ID"))
    @Getter
    @Setter
    private List<User> users;

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
//                ", users=" + users +
                '}';
    }
}