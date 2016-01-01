package pl.jrola.training.jpa.safari.ex7;

import pl.jrola.training.jpa.safari.ex7.entities.Account;
import pl.jrola.training.jpa.safari.ex7.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-31.
 */
public class MainManyToManyMapping {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Account account = entityManager.find(Account.class, 1L);
        System.out.println(account);

        User user = entityManager.find(User.class, 1L);
        System.out.println(user);

        entityManager.close();

    }

}
