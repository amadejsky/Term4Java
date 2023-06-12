package zad2;

import java.time.LocalTime;

public class Patient {
    private final String name;
    private final String surname;
    private final String pesel;
    private String sicknessDescription;
    private LocalTime visitTime;

    public Patient(String name, String surname, String pesel, String sicknessDescription, LocalTime visitTime) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.sicknessDescription = sicknessDescription;
        this.visitTime = visitTime;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getSicknessDescription() {
        return sicknessDescription;
    }

    public void setSicknessDescription(String sicknessDescription) {
        this.sicknessDescription = sicknessDescription;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sicknessDescription='" + sicknessDescription + '\'' +
                ", visitTime=" + visitTime +
                '}';
    }
}
