import java.util.ArrayList;
import java.util.List;

public class StudentService {


    private String classesName;
    private List<Student> studentList;


    public StudentService(String classesName) {
        this.classesName = classesName;
        studentList=new ArrayList<>();
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }
    public void addStudent(Student student){
        studentList.add(student);

    }

    List<String> fetchOnlySurnames(){
        List<String> list = new ArrayList<>();
        for(Student s: studentList){
            list.add(s.getSurname());
        }
        return list;
    }

    public int fetchStudentListSize(){
        return studentList.size();
    }

    public void showStudentNames(){
        for(int i=0;i<studentList.size();i++){
            System.out.println(i+" "+studentList.get(i).getName());
        }
    }

    public void removeStudent(int index){
        studentList.remove(index);
    }

    List<Student> fetchStudentsWitchHigherAverageGradeThan(double grade){
        List<Student> ls = new ArrayList<>();
        for(Student s: studentList){
            if(s.calculateFinalGrade()>grade);
            ls.add(s);
        }
        return ls;
    }

}
