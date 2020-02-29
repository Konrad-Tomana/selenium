import org.testng.annotations.Test;

public class Trojkat {

    public static int iloscBokow = 2;
    private String kolor;

    public Trojkat (String kolor) {
        this.kolor = "niebieski";
    }

    public void wypiszKolor() {
        System.out.println(kolor);
    }

    public static void wypiszIloscBokow() {
        System.out.println(iloscBokow);
    }

    @Test
    public void testTrojkatow() {
        Trojkat.wypiszIloscBokow();

        Trojkat trojkat = new Trojkat("niebieski");
        trojkat.wypiszKolor();
    }
}
