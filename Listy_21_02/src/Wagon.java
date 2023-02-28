import java.util.List;

public class Wagon {
    private final int maxMiejsc;
    private List<Pasazer> pasazerList;

    public int getMaxMiejsc() {
        return maxMiejsc;
    }

    public List<Pasazer> getPasazerList() {
        return pasazerList;
    }

    public void setPasazerList(List<Pasazer> pasazerList) {
        this.pasazerList = pasazerList;
    }

    public Wagon(int maxMiejsc, List<Pasazer> pasazerList) {
        this.maxMiejsc = maxMiejsc;
        this.pasazerList = pasazerList;
    }

    public boolean dodajPasazera(Pasazer p){
        if(pasazerList.size()<maxMiejsc){
            pasazerList.add(p);
            return true;
        }
        else return false;

    }

    public void wyswietlPasazerow(){
        for(Pasazer p:pasazerList)
            System.out.println(p.getImie()+ p.getNazwisko());
    }

    public void wyswietlInfoWagonu(){
        System.out.println("liczba mijesc w wagonie "+ maxMiejsc);
        System.out.println("liczba pasazerow w wagonie "+pasazerList.size());
        System.out.println("liczba wolnyhc miejsc "+(maxMiejsc- pasazerList.size()));
        System.out.println("Imiona i nazwiska pasazerow ");
        wyswietlPasazerow();
    }

    public int ileZeZnizkaSeniora(){
        int liczik=0;
        for(Pasazer p:pasazerList){
            if(p.getWiek()>=65)
                liczik++;
        }
        return liczik;
    }



}
