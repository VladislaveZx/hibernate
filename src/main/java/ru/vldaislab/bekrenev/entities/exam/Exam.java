package ru.vldaislab.bekrenev.entities.exam;

import ru.vldaislab.bekrenev.entities.student.Student;
import ru.vldaislab.bekrenev.entities.subject.Subject;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "exam")
@IdClass(ExamId.class)
public class Exam {

    @Id
    @ManyToOne
    @JoinColumn(name = "student", referencedColumnName = "number")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "subject", referencedColumnName = "number")
    private Subject subject;

    @Id
    @Column(name = "date_of_exam")
    private Date dateOfExam;

    @Column(name = "mark")
    private float mark;

    // Getters and Setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Date getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(Date dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
