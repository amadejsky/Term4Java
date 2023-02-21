import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class zad1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("red");
        lista.add("green");
        lista.add("orange");
        lista.add("white");
        lista.add("black");

        for(int i=0; i<lista.size();i++)
            System.out.println(lista.get(i));

        for(int i=2;i<lista.size();i++)
            System.out.println(lista.get(i));

        for(int i=lista.size()-1;i>-1;i--)
            System.out.println(lista.get(i));

        lista.add(0,"pink");
        lista.add(5,"yellow");

        for(String l:lista)
            System.out.println(l);

        Iterator<String> it = lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        System.out.println(lista.get(1)+lista.get(3));

        lista.remove("green");
        lista.add(1,"blue");

        lista.remove(1);
        System.out.println(lista);
        lista.sort(null);

        lista.contains("Red");

        List<String> lista2 = new ArrayList<>(List.of("Red","Blue","Green"));
//        lista2.add("red");
//        lista2.add("blue");
//        lista2.add("green");

        lista.addAll(lista2);
        System.out.println(lista);

        List<String> lista3 = new ArrayList<>();

        lista.removeAll(lista2);
        System.out.println(lista);

        List<String> listaZ = lista.subList(0,3);
        System.out.println(listaZ);


        lista2.removeAll(lista2);
        System.out.println(lista2);


        List<String> listaW = new LinkedList<>();
        listaW.add("red");
        listaW.add("green");
        listaW.add("black");
        listaW.add("white");
        listaW.add("pink");
        listaW.add("yellow");

        ((LinkedList<String>) listaW).addFirst("black");
        ((LinkedList<String>) listaW).addLast("black");

        ((LinkedList<String>) listaW).peek();

        List<String>Konwersja = new ArrayList<>(listaW);




    }
}
