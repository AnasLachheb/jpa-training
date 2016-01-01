package pl.jrola.training.jpa.safari.ex6;

import pl.jrola.training.jpa.safari.ex6.entities.Account;
import pl.jrola.training.jpa.safari.ex6.entities.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-31.
 */
public class MainOneToManyMapping {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Account account = entityManager.find(Account.class, 1L);
        System.out.println(account);

        Transaction transaction = entityManager.find(Transaction.class, 1L);
        System.out.println(transaction);

        entityManager.close();

    }

}
