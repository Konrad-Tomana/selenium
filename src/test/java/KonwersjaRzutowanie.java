import org.testng.annotations.Test;

public class KonwersjaRzutowanie {

    @Test
    public void testKonwersja (){

        int a = 1;
        double b = 2.22;
        double c = a + b;

        System.out.println(c);

        int d = a + (int)b;

        System.out.println(d);

    }
}
