package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;

public class HibernateUtil {
    private static final EntityManagerFactory emf /*= Persistence.createEntityManagerFactory("default");*/;

    static {
        emf = Persistence.createEntityManagerFactory("default");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
