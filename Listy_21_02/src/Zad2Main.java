import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2Main {
    private int licznik = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pasazer> lp = new ArrayList<>();
        for(int i = 1;i<=3;i++){
            String imie,nazwisko;
            int wiek;
            System.out.println("podaj imie");
            imie=sc.next();
            System.out.println("podaj nazwisko");
            nazwisko=sc.next();
            System.out.println("podaj wiek");
            wiek=sc.nextInt();
            lp.add(new Pasazer(imie,nazwisko,wiek));
        }

        Wagon w = new Wagon(100,lp);
        w.wyswietlPasazerow();
        w.wyswietlInfoWagonu();
        System.out.println("liczba seniorow "+w.ileZeZnizkaSeniora());


    }
}
