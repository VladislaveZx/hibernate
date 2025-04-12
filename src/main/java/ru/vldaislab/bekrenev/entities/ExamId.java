package ru.vldaislab.bekrenev.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class ExamId implements Serializable {

    private int student;
    private int subject;
    private Date dateOfExam;

    // Публичные геттеры и сеттеры
    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public Date getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(Date dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamId examId = (ExamId) o;
        return student == examId.student && subject == examId.subject && Objects.equals(dateOfExam, examId.dateOfExam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject, dateOfExam);
    }
}