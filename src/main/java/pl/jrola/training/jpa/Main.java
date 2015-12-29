package pl.jrola.training.jpa;


import pl.jrola.training.jpa.entities.hero.Hero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

/**
 * Created by JrQ- on 2015-10-03.
 */
public class Main {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        Hero h = new Hero();
        h.setId(3L);
        h.setCreationDate(new Date());
        h.setHeroLevel(Hero.Level.HIGH);
        h.setLevelDesc(Hero.Level.HIGH);
        h.setName("Chlebikowy Mag");
        entityManager.persist( h );

        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
