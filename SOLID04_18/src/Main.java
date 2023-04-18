import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        WordHelper.printWordsFromFile("tekst.txt");

        System.out.println("Porzadek naturnalny ");
        CountriesService countriesService = new CountriesService(new MapArrayProvider());
        countriesService.showCountriesInNatureOrder(Comparator.naturalOrder());
        System.out.println("odwornty porzdek");
        countriesService.showCountriesInNatureOrder(Comparator.reverseOrder());

        System.out.println("znaki polskie");
        countriesService.showCountriesInNatureOrder(StringNaturalOrderComparator.compare());

    }
}
