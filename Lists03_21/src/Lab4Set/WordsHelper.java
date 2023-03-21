package Lab4Set;

import java.util.Set;
import java.util.TreeSet;

public class WordsHelper {

    public static Set<Character> getUniqueChars(String s){
        Set <Character> set = new TreeSet<>();
//        for(int i=0;i<s.length();i++){
//            set.add(s.charAt(i));

            char[] characters = s.toCharArray();
            for(char c:characters)
                set.add(c);
            return set;
        }
    }



