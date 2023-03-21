package Lab4Set;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Grades {


    public static int countNumberOf5(List<Double> list){
        int c5=0;
        for(Double e:list){
            if(e==5)
                c5++;
        }
        return c5;
    }



    public static List<Double> getTheBestGrades(List<Double>list){
        List<Double> bestGrades = new ArrayList<>();
        for(Double e:list){
            if(e>=4.0){
                bestGrades.add(e);
            }
        }
        return bestGrades;
    }

    public static boolean checkGrade(List<Double> list,double grade){
        return list.contains(grade);
    }


    public static Set<Double> getGrades(){
        Set<Double> zbiorOcen = new TreeSet<>();
//        zbiorOcen.add(2.0);
//        zbiorOcen.add(3.5);
//        zbiorOcen.add(5.0);
//        zbiorOcen.add(3.0);
//        zbiorOcen.add(4.0);
//
//        return zbiorOcen;

//        return Set.of(2.0,3.0,3.5,4.0,4.5,5.0);
        return new TreeSet<>(Set.of(2.0,3.0,3.5,4.0,4.5,5.0));

    }

    public static Set<Double> showUniqueGrade(List<Double> list){


        return new TreeSet<>(list);
    }

}
