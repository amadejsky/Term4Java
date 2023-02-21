import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //create list of integers
        List<Integer> lista = new ArrayList<>(); //empty list

        lista.add(1); //autoboxing
        lista.add(5);
        lista.add(10);
        //add on index 1 element
        lista.add(1,-5);

        //display elements of list

        //for
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }

        //remove element
        lista.remove(Integer.valueOf(5));
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        for(Integer el:lista)
            System.out.println(el);

        Iterator<Integer> it = lista.iterator();
        while(it.hasNext())
            System.out.println(it.next());

        //Raw list
        List listasurowa = new ArrayList();
        listasurowa.add(1);
        listasurowa.add("Ala");

        for(Object o: listasurowa)
            System.out.println(o);
        //list of
        List<Integer> lista2 = List.of(1,2,3);

        //add two collections
        lista.addAll(lista2);
        System.out.println(lista);

        //sort
        lista.sort(null);
        System.out.println(lista);




    }
}
