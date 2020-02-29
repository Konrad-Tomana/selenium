package dziedziczenie;

public class Dziecko extends Rodzic {

    protected String kolorOczu = "zielone";

    public void wypiszMojKolorOczu() {
        System.out.println("Mój kolor oczu to " + kolorOczu);
    }
    public void wypiszMojKolorWlosow() {
        System.out.println("Mój kolor wlosow to " + kolorWlosow);
    }

    public void wypiszTypCeryOrazSklonnosciDoTycia() {
        System.out.println("Moja cera jest " + typCery + " oraz moje sklonnosci do tycia to " + sklonnoscDoTycia );
    }

    @Override
    public void probujePlywac(){
        System.out.println("Być może mam talent, ale chuj z nim");
    }
}
