import java.util.Objects;

public class Osoba implements Comparable<Osoba> {
    private String imie, nazwisko;
    private final String pesel;

    //naturalny porzdek wgledem peseli
    @Override
    public int compareTo(Osoba o) {
        return pesel.compareTo(o.pesel);
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

    public String getPesel() {
        return pesel;
    }

    public Osoba(String pesel, String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
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

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }


}
