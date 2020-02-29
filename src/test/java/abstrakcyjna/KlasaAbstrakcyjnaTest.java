package abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest {

    @Test
    public void testKlasyAbstrakcyjnej(){
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.napijSieWody();
        reksio.poruszajSie();
        System.out.println(reksio.nazwa);

        Ptak tweety = new Ptak();
        tweety.nazwa = "ptak";
        tweety.napijSieWody();
        tweety.poruszajSie();
        tweety.wypiszPrzysmak();
        System.out.println(tweety.nazwa);
    }
}
