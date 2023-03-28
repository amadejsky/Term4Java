package zad3;


import java.time.LocalTime;

public class Patient {
    private final String name;
    private final String surname;
    private final String pesel;
    private String sicknessDescription;

    private boolean isVip;

    public Patient(String name, String surname, String pesel, String sicknessDescription, boolean isVip) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.sicknessDescription = sicknessDescription;
        this.isVip = isVip;
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

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", sicknessDescription='" + sicknessDescription + '\'' +
                ", isVip=" + isVip +
                '}';
    }
}
