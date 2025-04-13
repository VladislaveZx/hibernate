package ru.vldaislab.bekrenev.repositories;

import ru.vldaislab.bekrenev.entities.student.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);
    Student findById(Integer number);
    List<Student> findAll();
    void update(Student student);
    void deleteById(Integer number);

}
