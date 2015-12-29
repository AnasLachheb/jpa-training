package pl.jrola.training.jpa.entities.hero;

import javax.persistence.AttributeConverter;

/**
 * Created by JrQ- on 2015-11-04.
 */
public class LevelDescColumnConverter implements AttributeConverter<Hero.Level, String> {

    public String convertToDatabaseColumn(Hero.Level attribute) {
        return attribute.getDesc();
    }

    public Hero.Level convertToEntityAttribute(String dbData) {

        Hero.Level enumObj = null;
        Hero.Level[] values = Hero.Level.values();
        for(Hero.Level item : values) {
            if(item.getDesc().equalsIgnoreCase(dbData)) {
                enumObj = item;
            }
        }

        return enumObj;
    }
}