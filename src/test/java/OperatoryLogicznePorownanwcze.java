import org.testng.annotations.Test;

public class OperatoryLogicznePorownanwcze {

    @Test
    public void testOperatorow() {

        int liczbaA = 2;
        int liczbaB = 5;

        System.out.println(liczbaA>liczbaB); //false
        System.out.println(liczbaA<liczbaB); // true
        System.out.println(liczbaA == liczbaB); //false
        System.out.println(liczbaA != liczbaB); //true
        System.out.println(liczbaA >= liczbaB); // false
        System.out.println(liczbaA <= liczbaB); //true



        System.out.println(1>0 && 1>-1); // && - koniunkcja // true
        System.out.println(1>2 || 0>-2); // || - alternatywa // false
        System.out.println(2>3 && 1>0); // false
        System.out.println(1>0 || 1>-1); //true





    }

}
