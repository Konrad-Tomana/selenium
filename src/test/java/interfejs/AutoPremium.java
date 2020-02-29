package interfejs;

public class AutoPremium implements Auto {
    @Override
    public void jedz() {
        System.out.println("Jedziesz na alusach");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Hamujesz zajebiście");
    }

    @Override
    public void otworzSzybe() {
        System.out.println("Szybkę otwierasz przyciskiem");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Automatyczna zajebista zmiana biegow");

    }

    public void specyficznaMetodaPremium() {
        System.out.println("Jako posiadacz auta premium, masz 30 proc. znizki na paliwo");
    }
}
