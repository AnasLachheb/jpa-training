package pl.jrola.training.jpa.safari.ex8.entities;

import lombok.Data;
import javax.persistence.*;

/**
 * Created by JrQ- on 2015-12-31.
 */
@Entity
@Table(name = "MARKET")
public @Data
class Market {

    @Id
    @Column(name="MARKET_ID")
    private Long marketId;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name="CURRENCY_NAME", referencedColumnName = "NAME"),
        @JoinColumn(name="COUNTRY_NAME", referencedColumnName = "COUNTRY_NAME")
    })
    private Currency currency;

    @Column(name="MARKET_NAME")
    private String marketName;
}
