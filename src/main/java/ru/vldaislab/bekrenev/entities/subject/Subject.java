package ru.vldaislab.bekrenev.entities.subject;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "number")
    private int number;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "hours_volume")
    private int hoursVolume;

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getHoursVolume() {
        return hoursVolume;
    }

    public void setHoursVolume(int hoursVolume) {
        this.hoursVolume = hoursVolume;
    }
}
