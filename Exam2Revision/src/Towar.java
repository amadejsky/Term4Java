class Towar {
    private String rodzaj;
    private String nazwa;
    private double cenaNetto;
    private double vat;

    public Towar(String rodzaj, String nazwa, double cenaNetto, double vat) {
        this.rodzaj = rodzaj;
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.vat = vat;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Towar{" +
                "rodzaj='" + rodzaj + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", vat=" + vat +
                '}';
    }
}