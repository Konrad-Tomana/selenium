public class Student {

    public String imie;
    public String nazwisko;
    public String grupa;


    public void przedstawSie(){
        System.out.println("Cześć! Nazywam się " + imie + " " + nazwisko);
            }

    public Student() {
        System.out.println("Cześć! Witaj w Konstruktorze!");

    }

    public Student (String noweImie, String noweNazwisko, String nowaGrupa) {
        imie = noweImie;
        nazwisko = noweNazwisko;
        grupa = nowaGrupa;
    }
}
