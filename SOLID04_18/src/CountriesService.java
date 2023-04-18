import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountriesService {
    private Map<String,String> mapOfCountries;

    public CountriesService(CountriesMapProvider mapProvider){
        this.mapOfCountries= mapProvider.fetchMapOfCountry();
    }

    public void fetchChoiceAndFindCapital(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kraj");
        String country = sc.nextLine();
        System.out.println("Stolica to "
                +mapOfCountries.getOrDefault(country,
                "Niepoprawna nazwa kraju lub nieznany kraj"));
    }

    public void showCountriesInNatureOrder(Comparator<String> comparator){
        Map<String,String> sortedMap = new TreeMap<>(comparator);
        sortedMap.putAll(mapOfCountries);
        for(Map.Entry<String,String > stringStringEntry: sortedMap.entrySet()){
            System.out.println("Nazwa kraju "+ stringStringEntry.getKey()+" stolica "+stringStringEntry.getValue());
        }
    }

}
