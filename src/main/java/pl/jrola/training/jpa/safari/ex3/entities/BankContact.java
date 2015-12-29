package pl.jrola.training.jpa.safari.ex3.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by JrQ- on 2015-12-30.
 */
@Embeddable
public class BankContact {

    @Column(name="NAME")
    private String name;

    @Column(name="POSITION_TYPE")
    private String positionType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    @Override
    public String toString() {
        return "BankContact{" +
                ", name='" + name + '\'' +
                ", positionType='" + positionType + '\'' +
                '}';
    }
}
