import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Utwórz nową kolejkę priorytetową, dodaj kilka stringów zawierających nazwy kolorów
        //jak na rysunku,
       Queue<String> qp= new PriorityQueue<>();//elemnty beda w kolejsce zgodnie z porzadkiemnaturalnym klasy String
        //ulozone rosnoca leksykograficznie
      // Queue<String> qp= new LinkedList<>();//FIFO
        //dodawanie add lub offer
        qp.add("Red");
        qp.offer("Green");
        qp.offer("Orange");
        qp.offer("White");
        qp.offer("Black");

        // pobierz 1-szy element kolejki- podejrzyj 1-szy element
        System.out.println("podgladamy 1-szy elem zgodnie z priorytetem - najmniejszy leksykograficznie");
        System.out.println(qp.peek());//lub qp.element()

        // pobierz i usuń 1-szy element kolejki
        System.out.println("usuwamy 1-szy zgodnie z priorytetem elem");
        System.out.println(qp.poll()); //lub remove()
        //wyświetl elementy kolejki
        System.out.println("kolejnosc przypadkowa ");
        for(String s:qp)
            System.out.println(s);
        System.out.println("zeby wyswietlic elem zgodnie z priorytetem uzywamy poll");
        String el;
        while((el=qp.poll()) != null)
            System.out.println(el);
        //mamy kolejka pusta
        System.out.println("Hello world!");
    }
}