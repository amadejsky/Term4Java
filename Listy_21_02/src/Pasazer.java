public class Pasazer {
    private String imie,nazwisko;
    private int wiek;

    public Pasazer(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Pasazer{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public void wyswietl(){
        System.out.println(toString());
    }
}
