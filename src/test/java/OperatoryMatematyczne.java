import org.testng.annotations.Test;

public class OperatoryMatematyczne {

    @Test
    public void testOperatory (){
        int pierwszaLiczba = 5;
        int drugaLiczba = 2;

        // suma
        int suma = pierwszaLiczba + drugaLiczba;

        // roznica
        int roznica = pierwszaLiczba - drugaLiczba;

        // iloczyn wynik mnozenia
        int iloczyn = pierwszaLiczba * drugaLiczba;

        //iloraz, dzielenie
        int iloraz = pierwszaLiczba / drugaLiczba;

        //modulo - ile reszty zostaje z dzielenia
        int modulo = drugaLiczba%pierwszaLiczba;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);
    }
}
