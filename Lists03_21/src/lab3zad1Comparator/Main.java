package lab3zad1Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Osoba> list = new ArrayList<>();
        list.add(new Osoba("2543234662345566","Jan","Kowalsky"));
        list.add(new Osoba("2543234855443333","Marla","Nowak"));
        list.add(new Osoba("4556778765444475","Adam","Pudelko"));
        list.add(new Osoba("4556777777777744","Adam","Łęcki"));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
        list.sort(null);
//last name sort
        Comparator<Osoba>comparator=Comparator.comparing(Osoba::getNazwisko).thenComparing(Osoba::getImie);

        list.sort(comparator);
        System.out.println(list);

    }
}
