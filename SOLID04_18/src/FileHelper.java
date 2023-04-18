import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileHelper {
    public static List<String> getWordsFromFile(String filename){
        List<String> wordList = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File(filename)).useDelimiter("\\w");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String [] words = line.split(" ");
                for(String word : words){
                    wordList.add(word);
                }
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return wordList;

    }




}
