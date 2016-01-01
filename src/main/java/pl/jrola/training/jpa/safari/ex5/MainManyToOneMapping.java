package pl.jrola.training.jpa.safari.ex5;

import pl.jrola.training.jpa.safari.ex4.entities.Credential;
import pl.jrola.training.jpa.safari.ex4.entities.User;
import pl.jrola.training.jpa.safari.ex5.entities.Account;
import pl.jrola.training.jpa.safari.ex5.entities.Bank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-31.
 */
public class MainManyToOneMapping {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Account account = entityManager.find(Account.class, 1L);
        System.out.println(account);

        Bank bank = entityManager.find(Bank.class, 1L);
        System.out.println(bank);

        entityManager.close();

    }


}
