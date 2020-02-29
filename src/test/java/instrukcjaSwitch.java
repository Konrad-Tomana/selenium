import org.testng.annotations.Test;

public class instrukcjaSwitch {

    @Test
    public void testSwitch () {
        wypiszDzienTygodnia(1);
        wypiszDzienTygodnia(2);
        wypiszDzienTygodnia(3);
        wypiszDzienTygodnia(4);
        wypiszDzienTygodnia(9);

    }

    public void wypiszDzienTygodnia(int dzienTygodnia){
        switch (dzienTygodnia) {
            case 1:
                System.out.println("Jest poniedziałek");
                break;
            case 2:
                System.out.println("Jest wtorek");
                break;
            case 3:
                System.out.println("Jest sroda");
                break;
            case 4:
                System.out.println("Jest czwartek");
                break;
            case 5:
                System.out.println("Jest piatek");
                break;
            case 6:
                System.out.println("Jest sobota");
                break;
            case 7:
                System.out.println("Jest niedziela");
                break;
                default:
                    System.out.println("Błędne wartości");
        }

    }
}
