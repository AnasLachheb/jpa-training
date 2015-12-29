package pl.jrola.training.jpa.safari.ex1;

import pl.jrola.training.jpa.safari.ex1.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-25.
 */
public class MainFormula {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        User user = entityManager.find(User.class, 1L);
        System.out.println(user);

        entityManager.close();

    }

}
