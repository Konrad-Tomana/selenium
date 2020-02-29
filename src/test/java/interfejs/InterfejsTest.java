package interfejs;

import org.testng.annotations.Test;

public class InterfejsTest {

    @Test
    public void interfejsTest () {
      Auto autoPremium = new AutoPremium();
      zaprezentujAuto(autoPremium);

      Auto auto = new PodstawoweAuto();
      zaprezentujAuto(auto);

    }

    public void zaprezentujAuto(Auto auto) {
        auto.jedz();
        auto.zatrzymaj();
        auto.zmienBieg();
        auto.otworzSzybe();
    }

}
