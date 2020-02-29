import org.testng.annotations.Test;

public class Metody {

    public void nazwaMetody () {
        int a = 2;
        int b = 3;
        System.out.println(a+b);
    }

    public int suma(){
        int a = 2;
        int b = 3;
        return a + b;
    }

    int wynikDzialania = suma();

    public Student pobierzDaneStudenta(){
        Student student = new Student();
        student.imie = "Tomasz";
        student.nazwisko = "Kot";
        student.grupa = "1 - Idioci";
        return student;

    }

    @Test
    public void testMetod () {
        nazwaMetody();
        System.out.println(suma());
        System.out.println(wynikDzialania);
        Student student = pobierzDaneStudenta();
        System.out.println(student.imie);
        System.out.println(student.nazwisko);
        System.out.println(student.grupa);


    }
}
