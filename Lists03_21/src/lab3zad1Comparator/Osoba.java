package lab3zad1Comparator;

import java.util.Objects;

public class Osoba implements Comparable<Osoba> {
    private final String pesel;
    private String imie;
    private String nazwisko;

    public Osoba(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel='" + pesel + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba osoba)) return false;
        return Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public int compareTo(Osoba o) {
        return pesel.compareTo(o.pesel);
    }
}
