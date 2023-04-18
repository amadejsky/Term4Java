import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WordHelper {
    private static Map<String,Integer> calculateWordsFromFile(String filename){
        List<String> wordsList = FileHelper.getWordsFromFile(filename);

        Map<String,Integer> wordsCounterMap = new TreeMap<>();

        for(String word:wordsList){

            if(wordsCounterMap.containsKey(word)){
                wordsCounterMap.put(word,wordsCounterMap.get(word)+1);
            }else wordsCounterMap.put(word,1);
        }
        return wordsCounterMap;
    }

    public static void printWordsFromFile(String filename){
        Map<String,Integer> wordsList = calculateWordsFromFile(filename);
        for(Map.Entry<String,Integer> entry : wordsList.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


}
