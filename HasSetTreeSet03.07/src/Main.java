import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("b");
        stringSet.add("A");
        stringSet.add("c");
        stringSet.add("f");
        stringSet.add("Q");

        System.out.println(stringSet);
        for(String s:stringSet) System.out.println(s+" ");
        System.out.println("////////////////////////////////");
        Set<String> stringSet1 = new LinkedHashSet<>();
        stringSet1.add("a");
        stringSet1.add("b");
        stringSet1.add("b");
        stringSet1.add("A");
        stringSet1.add("c");
        stringSet1.add("f");
        stringSet1.add("Q");
        stringSet1.add("Ą");
        stringSet1.add("Ś");
        System.out.println(stringSet1);


        Set<String> stringSet2 = new TreeSet<>(stringSet1);
        System.out.println(stringSet2);

        System.out.println("po polsku");
        Set<String> stringSet3 = new TreeSet<>(Collator.getInstance());
        stringSet3.addAll(stringSet2);
        System.out.println(stringSet3);


        HashSet<Osoba> osobas = new HashSet<>();

        osobas.add(new Osoba("22222222222", "Anna", "Nowak"));
        osobas.add(new Osoba("33333333333", "Jan", "Kowalski"));
        osobas.add(new Osoba("55555555555", "Jan", "Kowalski"));
        osobas.add(new Osoba("11111111111", "Paweł", "Wolski"));
        osobas.add(new Osoba("11111112222", "Paweł", "Łoś"));
        osobas.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        osobas.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        System.out.println(osobas);

        if(osobas.contains(new Osoba("55555555555",null,null)))
        System.out.println("jest");
        else
        System.out.println("nie ma");



        Set<Osoba> osobas1 = new TreeSet<>();//musi miec okreslony naturalny porzodek implentowac comparable
        osobas1.add(new Osoba("22222222222", "Anna", "Nowak"));
        osobas1.add(new Osoba("33333333333", "Jan", "Kowalski"));
        osobas1.add(new Osoba("55555555555", "Jan", "Kowalski"));
        osobas1.add(new Osoba("11111111111", "Paweł", "Wolski"));
        osobas1.add(new Osoba("11111112222", "Paweł", "Łoś"));
        osobas1.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        osobas1.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        System.out.println(osobas1);

        Set<Osoba> osobas2 = new TreeSet<Osoba>(new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                int o=o1.getNazwisko().compareTo(o2.getNazwisko());
                if(o==0) o=o1.getImie().compareTo(o2.getImie());
                return o;
            }
        });

        osobas2.add(new Osoba("22222222222", "Anna", "Nowak"));
        osobas2.add(new Osoba("33333333333", "Jan", "Kowalski"));
        osobas2.add(new Osoba("55555555555", "Jan", "Kowalski"));
        osobas2.add(new Osoba("11111111111", "Paweł", "Wolski"));
        osobas2.add(new Osoba("11111111112", "Paweł", "Wolski"));
        osobas2.add(new Osoba("11111112222", "Paweł", "Łoś"));
        osobas2.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        osobas2.add(new Osoba("22222222222", "Anna", "Nowak-Jezior"));
        System.out.println(osobas2);


    }
}
