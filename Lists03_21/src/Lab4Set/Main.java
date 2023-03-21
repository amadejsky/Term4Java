package Lab4Set;

import Lab4Set.Grades;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("unique chars in word");
        for(char ch: WordsHelper.getUniqueChars("ala ma kota "))
            System.out.println(ch);
        System.out.println("Oceny akademickie");
        for(double d: Grades.getGrades()){
            System.out.println(d);

            List<Double> list = new ArrayList<>(List.of(3.0,4.0,5.0,3.5,5.0,5.0));
            System.out.println(list);
            System.out.println("amount of 5 "+Grades.countNumberOf5(list));
            System.out.println("Best grades");
            for(double g:Grades.getTheBestGrades(list))
                System.out.println(d);
            if(Grades.checkGrade(list,4.5))
                System.out.println("there is 4.5");
            else System.out.println("there's not 4.5");

            System.out.println("unique grades");
            System.out.println(Grades.showUniqueGrade(list));

        }
    }
}
