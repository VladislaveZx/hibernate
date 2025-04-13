package ru.vldaislab.bekrenev;


import ru.vldaislab.bekrenev.entities.student.Student;
import ru.vldaislab.bekrenev.services.StudentService;

import java.util.List;
public class Main {
    public static void main(String[] args) {
       StudentService studentService = new StudentService();

        Student student = new Student(19,"Петров И.И.", 2001, 147);

        // Create
        studentService.save(student);

        // Read
        Student s = studentService.findById(5);
        System.out.println("Найден студент: " + s.getFullName());

        // Update
        s.setGroupNumber(148);
        studentService.update(s);

        // Read All
        List<Student> students = studentService.findAll();
        students.forEach(st -> System.out.println(st.getFullName()));

        // Delete
        studentService.deleteById(6);
    }
}