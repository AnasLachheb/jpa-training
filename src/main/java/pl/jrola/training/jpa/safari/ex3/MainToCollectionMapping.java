package pl.jrola.training.jpa.safari.ex3;

import pl.jrola.training.jpa.safari.ex3.entities.Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;

/**
 * Created by JrQ- on 2015-12-29.
 */
public class MainToCollectionMapping {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Bank bank = entityManager.find(Bank.class, 1L);
        System.out.println(bank);

        entityManager.close();

    }

}