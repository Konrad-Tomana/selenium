import org.testng.annotations.Test;

public class instrukcjaIfElse {

    // instrukcja warunkowa

    @Test
    public void testInstrukcji (){
        sprawdzWiek(17);
        sprawdzWiek(20);

    }

    public void sprawdzWiek(int wiek) {

        if (wiek < 18) {
            System.out.println("Mlodziezy alko nie sprzedajem, wypierdalać");
        } else {
            System.out.println("Oki, chlaj!");
        }

    }
}
