import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class StringNaturalOrderComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return Collator.getInstance(new Locale("pl")).compare(s1,s2);
    }

}
