import java.text.Collator;
import java.util.*;

//import static java.lang.ConditionalSpecialCasing.entry;

public class Main {
    static String stolice = """
Albania/Tirana
Andora/Andorra la Vella
Austria/Wiedeń
Belgia/Bruksela
Białoruś/Mińsk
Bośnia i Hercegowina/Sarajewo
Bułgaria/Sofia
Chorwacja/Zagrzeb
Czarnogóra/Podgorica
Czechy/Praga
Dania/Kopenhaga
Estonia/Tallinn
Finlandia/Helsinki
Francja/Paryż
Grecja/Ateny
Hiszpania/Madryt
Holandia/Amsterdam
Irlandia/Dublin
Islandia/Reykjavík
Kosowo/Prisztina
Liechtenstein/Vaduz
Litwa/Wilno
Luksemburg/Luksemburg
Łotwa/Ryga
Macedonia/Skopje
Malta/La Valletta
Mołdawia/Kiszyniów
Monako/Monako
Niemcy/Berlin
Norwegia/Oslo
Polska/Warszawa
Portugalia/Lizbona
Rosja/Moskwa
Rumunia/Bukareszt
San Marino/San Marino
Serbia/Belgrad
Słowacja/Bratysława
Słowenia/Lublana
Szwajcaria/Berno
Szwecja/Sztokholm
Ukraina/Kijów
Watykan/Watykan
Węgry/Budapeszt
Wielka Brytania/Londyn
Włochy/Rzym
""";
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String,String> mapaKrajeStolice = new HashMap<>();
        Scanner sc = new Scanner(stolice);
        while(sc.hasNext()){
            String linia = sc.nextLine();
            String[] tab = linia.split("/");
            mapaKrajeStolice.put(tab[0],tab[1]);
        }
        System.out.println(mapaKrajeStolice);

        Scanner scin = new Scanner(System.in);
        System.out.println("podaj kraj");
        String kraj = scin.nextLine();
        System.out.println(kraj+" "+mapaKrajeStolice.getOrDefault(kraj,"nie ma danych tego kraju "));


        Map<String,String> mapTree = new TreeMap<>(mapaKrajeStolice);
        System.out.println("treee map "+mapTree);
        Map<String,String> mapTreePL = new TreeMap<>(Collator.getInstance());
        //sortowanir zgodnie z kolatorem po polsku
        mapTreePL.putAll(mapTree);
        System.out.println("pl "+mapTreePL);
        for(String key:mapTreePL.keySet())
            System.out.println(key+" "+mapTreePL.get(key));

        Map<String,String> mapTreePlro = new TreeMap<>(Collections.reverseOrder(Collator.getInstance()));
        mapTreePL.putAll(mapTree);
        System.out.println("pl ro"+ mapTreePlro);
        for(Map.Entry<String,String> entry:mapTreePL.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        mapTreePL.remove(entry.getKey());
    }
Iterator<Map.Entry<String,String> >iterator=mapaKrajeStolice.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry =  iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
            if(entry.getKey().contains("r"))
                iterator.remove();
        }

        System.out.println(mapaKrajeStolice);
}}