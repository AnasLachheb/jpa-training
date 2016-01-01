package pl.jrola.training.jpa.safari.ex9.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by JrQ- on 2016-01-01.
 */
@Entity
@Table(name = "BOND")
public class Bond extends Investment{

    @Id
    @Column(name = "BOND_ID")
    @Getter
    @Setter
    private Long bondId;

    @Column(name = "VALUE")
    @Getter
    @Setter
    private BigDecimal value;

    @Column(name = "INTEREST_RATE")
    @Getter
    @Setter
    private BigDecimal interestRate;

    @Column(name = "MATURITY_DATE")
    @Getter
    @Setter
    private Date maturityDate;

    @Override
    public String toString() {
        return "Bond{" +
                "bondId=" + bondId +
                ", value=" + value +
                ", interestRate=" + interestRate +
                ", maturityDate=" + maturityDate +
                "} " + super.toString();
    }
}
