package pl.jrola.training.jpa.safari.ex8.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public
@Data
class CurrencyId implements Serializable {

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNTRY_NAME")
    private String countryName;
}