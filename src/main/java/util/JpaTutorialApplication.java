package util;

import javax.persistence.EntityManagerFactory;

public class JpaTutorialApplication {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =
                HibernateUtil.getEntityManagerFactory();

        System.out.println("done");
    }
}
