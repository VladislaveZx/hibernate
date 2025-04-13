package ru.vldaislab.bekrenev.services;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.vldaislab.bekrenev.entities.student.Student;
import ru.vldaislab.bekrenev.repositories.StudentRepository;
import ru.vldaislab.bekrenev.utils.HibernateUtil;

import java.util.List;

public class StudentService implements StudentRepository {


    // CREATE
    public void save(Student student) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            // Обновит, если существует, вставит, если нет
            session.merge(student);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ (по id)
    public Student findById(Integer number) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Student.class, number);
        }
    }

    // READ (все записи)
    public List<Student> findAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

    // UPDATE
    public void update(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteById(Integer number) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class, number);
            if (student != null) {
                session.delete(student);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
