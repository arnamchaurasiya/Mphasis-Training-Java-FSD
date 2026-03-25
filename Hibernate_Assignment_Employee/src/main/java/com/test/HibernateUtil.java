package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildFactory();

    private static SessionFactory buildFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("SessionFactory creation failed!");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}