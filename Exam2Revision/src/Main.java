import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Double> lista1 = List.of(4.4,234.565,-34.0,45.5);
        Strumienie.wyswietlPrzedzial(lista1);
        Strumienie.zwroocListe(lista1);

    }


    public class listProvider{
        public static List<Towar> provideList(String filename){
          List<Towar> listTowarow = new ArrayList<>();
          try(BufferedReader br = new BufferedReader(new FileReader(filename))){
              String linia;
              while((linia = br.readLine()) != null ){
                Towar towar = mapujLinieNaTowar(linia);
                listTowarow.add(towar);
              }
          }catch (IOException e){
              e.printStackTrace();
          }
          return listTowarow;
        }

        public static Towar mapujLinieNaTowar(String linia){
            String[] linijka = linia.split(";");
            String rodzaj = linijka[0];
            String nazwa = linijka[1];
            Double cena = Double.valueOf(linijka[2]);
            Double vat = Double.valueOf(linijka[3]);
            return new Towar(rodzaj,nazwa,cena,vat);

        }
}

public class mapProvider{
        public static Map<Double, List<Towar>> rodzaj(List<Towar> towary){
            return towary.stream()
                    .collect(Collectors.groupingBy(t->t.getVat()));
        }

        public static List<Double> poVacie(List<Towar> towary){
            return (List<Double>) towary.stream().map(t->t.getVat()).distinct().toList();
        }
}


public class Strumienie{
        public static void wyswietlPrzedzial(List<Double> lp){
            lp.stream().filter(n->n>10&&n<100).forEach(n-> System.out.println(n));
        }

        public static List<Double> zwroocListe(List<Double> ld){
            return ld.stream().filter(n->n>0).map(n->Math.sqrt(n)).toList();
        }
}
}

