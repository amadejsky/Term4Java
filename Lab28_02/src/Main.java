import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService serv = new StudentService("POII gr2");
        serv.addStudent(new Student("aaa","bbb", List.of(4,5,2,3)));

        serv.addStudent(new Student("ccc","ddd", new ArrayList<>(List.of(3,5,3,3))));

        serv.showStudentNames();













    }














}
