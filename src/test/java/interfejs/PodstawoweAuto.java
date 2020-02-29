package interfejs;

public class PodstawoweAuto implements Auto {

    private String model = "Astra II";
    private String marka = "Opel";

    public void toJestMetodaSpecyficzna (){
        System.out.println("Metoda dla posiadaczy auto w wersji podstawowej - " + model);

    }

    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowym modelem Auta");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz podstawowe auto, bebnowymi chujowymi hamulcami");
    }

    @Override
    public void otworzSzybe() {
        System.out.println("Otwierasz auto korba");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmieniasz bieg starą rozpierdalającą sie skrzynia manualna");
    }
}
