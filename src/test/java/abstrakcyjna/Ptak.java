package abstrakcyjna;

public class Ptak extends Zwierzatko {
    @Override
    public void poruszajSie() {
        System.out.println("latam!");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("lubię ziarno");
    }
}
