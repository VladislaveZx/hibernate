package ru.vldaislab.bekrenev.entities.student;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "number")
    private Integer number;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "group_number", nullable = true)
    private Integer groupNumber;

    @Column(name = "birth_year", nullable = true)
    private Integer birthYear;

    public Student(Integer number, String fullName, Integer birthYear, Integer groupNumber) {
        this.number = number;
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.birthYear = birthYear;
    }

    public Student() {

    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
}