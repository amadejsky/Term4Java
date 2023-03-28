import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> qp = new PriorityQueue<>();
        qp.add("Red");
        qp.offer("Green");
        qp.offer("Orange");
        qp.offer("White");
        qp.offer("Black");
        System.out.println("Pierwszy element ");
        System.out.println(qp.peek());
        System.out.println(qp.poll());

        for(String s:qp)
            System.out.println(s);
        String el;
        while((el=qp.poll()) != null)
            System.out.println(el);


    }
}
