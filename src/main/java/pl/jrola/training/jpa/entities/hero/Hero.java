package pl.jrola.training.jpa.entities.hero;

import javax.persistence.*;

import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "JHT_HEROES")
public class Hero {

    public enum Level {

        LOW("Low 1"),
        MEDIUM("Medium 2"),
        HIGH("High 3");

        private String desc;

        Level(String level) {
            this.desc = level;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    @Id
    private Long id;

    private Date creationDate;

    private String name;

    @Enumerated(EnumType.STRING)
    private Level heroLevel;

    @Convert(converter = LevelDescColumnConverter.class)
    private Level levelDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(Level level) {
        this.heroLevel = level;
    }

    public Level getLevelDesc() {
        return levelDesc;
    }

    public void setLevelDesc(Level levelDesc) {
        this.levelDesc = levelDesc;
    }
}