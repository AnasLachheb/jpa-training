package pl.jrola.training.jpa.safari.ex4;

import pl.jrola.training.jpa.safari.ex4.entities.Credential;
import pl.jrola.training.jpa.safari.ex4.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by JrQ- on 2015-12-31.
 */
public class MainOneToOneMapping {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Credential credential = entityManager.find(Credential.class, 1L);
        System.out.println(credential);

        User user = entityManager.find(User.class, 1L);
        System.out.println(user);

        entityManager.close();


    }

}
