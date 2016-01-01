package pl.jrola.training.jpa.safari.ex9.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by JrQ- on 2016-01-01.
 */
@Entity
@Table(name = "STOCK")
public class Stock extends Investment {

    @Id
    @Column(name = "STOCK_ID")
    @Getter
    @Setter
    private Long stockId;

    @Column(name = "SHARE_PRICE")
    @Getter
    @Setter
    private BigDecimal sharePrice;

    @Column(name = "QUANTITY")
    @Getter
    @Setter
    private BigDecimal quantity;

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", sharePrice=" + sharePrice +
                ", quantity=" + quantity +
                "} " + super.toString();
    }
}