import java.util.HashMap;
import java.util.Map;

public class MapArrayProvider implements CountriesMapProvider {
    private final static String[] COUNTRIES = new String[]{
            "Albania/Tirana",
            "Andora/Andorra la Vella",
            "Austria/Wiedeń",
            "Belgia/Bruksela",
            "Białoruś/Mińsk",
            "Bośnia i Hercegowina/Sarajewo",
            "Bułgaria/Sofia",
            "Chorwacja/Zagrzeb",
            "Czarnogóra/Podgorica",
            "Czechy/Praga",
            "Dania/Kopenhaga",
            "Estonia/Tallinn",
            "Finlandia/Helsinki",
            "Francja/Paryż",
            "Grecja/Ateny",
            "Hiszpania/Madryt",
            "Holandia/Amsterdam",
            "Irlandia/Dublin",
            "Islandia/Reykjavík",
            "Kosowo/Prisztina",
            "Liechtenstein/Vaduz",
            "Litwa/Wilno",
            "Luksemburg/Luksemburg",
            "Łotwa/Ryga",
            "Macedonia/Skopje",
            "Malta/La Valletta",
            "Mołdawia/Kiszyniów",
            "Monako/Monako",
            "Niemcy/Berlin",
            "Norwegia/Oslo",
            "Polska/Warszawa",
            "Portugalia/Lizbona",
            "Rosja/Moskwa",
            "Rumunia/Bukareszt",
            "San Marino/San Marino",
            "Serbia/Belgrad",
            "Słowacja/Bratysława",
            "Słowenia/Lublana",
            "Szwajcaria/Berno",
            "Szwecja/Sztokholm",
            "Ukraina/Kijów",
            "Watykan/Watykan",
            "Węgry/Budapeszt",
            "Wielka Brytania/Londyn",
            "Włochy/Rzym",
    };

    @Override
    public Map<String, String> fetchMapOfCountry() {
        Map<String,String> capitalOfCountries = new HashMap<>();
        for(String str: COUNTRIES ){
            String[] split = str.split("/");
            capitalOfCountries.put(split[0],split[1]);
        }
        return capitalOfCountries;
    }

}
