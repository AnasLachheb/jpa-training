package pl.jrola.training.jpa.safari.ex8.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by JrQ- on 2015-12-31.
 */

@Entity
@Table(name="CURRENCY")
public
@Data
class Currency {

    @EmbeddedId
    private CurrencyId id;

    @Column(name = "SYMBOL")
    private String symbol;

}
