package pl.jrola.training.jpa.safari.ex9;

import pl.jrola.training.jpa.safari.ex9.entities.Bond;
import pl.jrola.training.jpa.safari.ex9.entities.Stock;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2016-01-01.
 */
public class MainMappedSuperclass {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Stock stock = entityManager.find(Stock.class, 1450L);
        System.out.println(stock);

        Bond bond = entityManager.find(Bond.class, 1451L);
        System.out.println(bond);

        entityManager.close();
    }

}