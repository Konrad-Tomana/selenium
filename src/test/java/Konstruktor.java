import org.testng.annotations.Test;

public class Konstruktor {

    @Test
    public void testKonstruktor () {

        Student student = new Student();

        Student drugiStudent = new Student ("Jan", "Kowalski", "1 - Debile");
        drugiStudent.przedstawSie();


    }
}
