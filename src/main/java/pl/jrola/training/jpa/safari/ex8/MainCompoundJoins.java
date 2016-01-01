package pl.jrola.training.jpa.safari.ex8;

import pl.jrola.training.jpa.safari.ex8.entities.Market;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-31.
 */
public class MainCompoundJoins {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Market market = entityManager.find(Market.class, 1L);
        System.out.println(market);

        entityManager.close();

    }

}
