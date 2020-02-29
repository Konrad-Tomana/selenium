import org.testng.annotations.Test;

public class StudentTest {

@Test

public void testStudent (){
    Student pierwszyStudent = new Student();
    pierwszyStudent.nazwisko = "Kowalski";
    pierwszyStudent.imie = "Jan";
    pierwszyStudent.grupa = "1 - Debile";

    pierwszyStudent.przedstawSie();

    Student drugiStudent = new Student();
    drugiStudent.imie = "Matejko";
    drugiStudent.nazwisko = "Mateusz";
    drugiStudent.grupa = "3 - Dekle";


    drugiStudent.przedstawSie();

}


}
