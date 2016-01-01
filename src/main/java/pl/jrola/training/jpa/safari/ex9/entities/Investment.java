package pl.jrola.training.jpa.safari.ex9.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by JrQ- on 2016-01-01.
 */
@MappedSuperclass
@Data
public abstract class Investment {

    @Column(name = "NAME")
    protected String name;

    @Column(name = "ISSUER")
    protected String issuer;

    @Column(name = "PURCHASE_DATE")
    protected Date purchaseDate;
}