import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService service= new StudentService("POII gr2");
        service.addStudent(new Student("ddzcds","defrf", new ArrayList<>(List.of(4,5,2,3))));
        service.addStudent(new Student("aaa","tgyhn", new ArrayList<>(List.of(5,5,5,3))));
        service.addStudent(new Student("bbaa","uki", new ArrayList<>(List.of(3,4))));
        service.showStudentNames();
        System.out.println(service.fetchStudentGrades());


        System.out.println("Hello world!");
    }
}