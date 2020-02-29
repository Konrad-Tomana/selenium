public class Tablice {

    int liczby [] = new int[5];

    public void ustawWartosci(){
        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;
    }

    public void wypiszElementyTablicy(){
        for (int i=0; i<liczby.length;i++){
            System.out.println(liczby[i]);
        }
    }

    Student studenci[] = new Student[2];

    public void dodajStudentów(){
        Student pierwszy = new Student("Tomasz","Kot","I");
        Student drugi = new Student("Kasia", "Chujasia", "II");

        studenci[0] = pierwszy;
        studenci[1] = drugi;

    }

    public void przedstawStudentow(){
        try {
            studenci[0].przedstawSie();
            studenci[1].przedstawSie();
          //  studenci[2].przedstawSie();
            System.out.println("Tutaj robie coś innego");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(" Wystapil wyjatek! Odwołujesz się do elemntu którego nie ma w tablicy");
        } finally {
            System.out.println("Zamykam połącznie do bazy danych");
        }
    }

}
