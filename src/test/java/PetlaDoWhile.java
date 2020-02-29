import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhile {

    @Test
    public void testPetliDoWhile () {

        int index = 0;

        // kod zawarty w sekcji "do" wykona się zawsze

        List<String> rzeczy = Arrays.asList("Lampa", "Wibrator", "Sofa", "Barbakan");

        do {
            System.out.println(rzeczy.get(index));
            index++;

        }while (index<rzeczy.size());

    }
}
