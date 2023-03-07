import java.util.ArrayList;
import java.util.List;

public class StudentService {//grupa zajeciowa
    private String className;//nazwę zajęć
    private List<Student> studentList;//-listę studentów uczęszczających na dane zajęcia
    //konstruktor inicjalizujący nazwę zajęć na podstawie nazwy przekazanej parametrem
    //oraz tworzący pustą listę studentów


    public String fetchStudentGrades(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<studentList.size();i++){
            sb.append(i).append(" - ");
            //pobieramy liste ocen
            List<Integer> lg = studentList.get(i).getGradesList();
            //przechodzimy po ocenach i dodajemy do sb
            for(int ocena: lg)
                sb.append(ocena).append(",");
            sb.deleteCharAt(sb.length()-1);
            sb.append("; ");

        }
        return sb.toString();
    }


    public StudentService(String className) {
        this.className = className;
        studentList = new ArrayList<>();
    }
    //- get i set dla nazwy zajęć

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    //- addStudent(Student student) - dodaje studenta na koniec listy
    public void addStudent(Student student){
        studentList.add(student);
    }

    //- fetchStudentNames() - zwracającą listę nazwisk studentów
    List<String>  fetchStudentNames(){
        List<String> list = new ArrayList<>();// lista nazwisk
        //przechodzimy po liscie studentow i dodajemy ich nazwiska do listy list
        for(Student s:studentList)
            list.add(s.getSurname());
        return  list;
    }
    //- fetchStudentsAmount() - zwracającą obecną liczbę studentów
    public int fetchStudentsAmount(){
        return studentList.size();
    }
    //- showStudentNames() - wyświetlającą studentów w formacie: “Nr_na_liście imie
    //nazwisko”
    public void showStudentNames(){
        //for z indeksami
        for(int i=0; i<studentList.size();i++){
            System.out.println((i+1)+ " " + studentList.get(i).getName()
                    +" " + studentList.get(i).getSurname());
        }
    }


    //- removeStudent(int index) - usuwającą studenta z listy
    public void removeStudent(int index){
        studentList.remove(index);
    }
    //- showStudentsWithSurname(String surname) - wyświetlającą studentów o
    //podanym nazwisku

    //fetchStudentsWithGradeHigherThan(double grade) - zwracającą listę
    //studentów ze średnią ocen wyższą niż ta podana w parametrze
    List<Student> fetchStudentsWithGradeHigherThan(double grade){
        List<Student> ls= new ArrayList<>();
        //przechodzimy po studentach i do listy ls dodajemy tych ktorzy maja srednia> grade
        for(Student st:studentList)
            if(st.calculateFinalGrade()>grade)
                ls.add(st);
        return ls;
    }

}
