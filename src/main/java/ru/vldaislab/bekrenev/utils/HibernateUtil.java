package ru.vldaislab.bekrenev.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.vldaislab.bekrenev.entities.student.Student;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure(); // загружает hibernate.cfg.xml
            configuration.addAnnotatedClass(Student.class); // 👈 Обязательно!
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
