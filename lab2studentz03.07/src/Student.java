import java.util.List;

public class Student {
    private String name,surname;
    private List<Integer> gradesList;//lista ocen z przedmiotu
  //metodę calculateFinalGrade() zwracającą średnią z ocen (lub -1 jeśli lista jest
  //pusta).
    public double calculateFinalGrade(){
        if(gradesList.isEmpty()) return -1;
        int s=0;
        for(int g:gradesList)
            s+=g;
        return (double) s/gradesList.size();
    }
    public Student(String name, String surname, List<Integer> gradesList) {
        this.name = name;
        this.surname = surname;
        this.gradesList = gradesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Integer> getGradesList() {
        return gradesList;
    }

    public void setGradesList(List<Integer> gradesList) {
        this.gradesList = gradesList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gradesList=" + gradesList +
                '}';
    }
}
