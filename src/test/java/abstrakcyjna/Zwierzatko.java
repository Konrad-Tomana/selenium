package abstrakcyjna;

public abstract class Zwierzatko {

    public String nazwa = "ChujoPies";

    public abstract void poruszajSie();

    public abstract void wypiszPrzysmak();

    public void napijSieWody(){
        System.out.println("Piję wodę");
    }
}
