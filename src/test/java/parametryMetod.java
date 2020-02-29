import org.testng.annotations.Test;

public class parametryMetod {


    public int suma(int pierwszaLiczba, int drugaLiczba){
        // suma = pierwsza liczba + druga liczba
        return pierwszaLiczba + drugaLiczba;
    }

    public void przywitajSie (String imie) {
        System.out.println("Witaj " + imie);
    }

    @Test
    public void testParametrów() {
        int sumaLiczb = suma(1, 2);
        System.out.println(sumaLiczb);
        System.out.println(suma(2,5));
        przywitajSie ("Kasia");
        przywitajSie("Tomek");


    }
}
