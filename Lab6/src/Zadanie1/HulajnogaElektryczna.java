package Zadanie1;

public class HulajnogaElektryczna extends Pojazd implements Wypozyczony{
    private static final double Stawka_Godzinowa = 20.0;

    public HulajnogaElektryczna(String nazwa) {
        super(nazwa);
    }

    @Override
    public double obliczKosztWynajmu(int godziny) {
        return godziny * Stawka_Godzinowa;
    }

    @Override
    public String getTypPojazdu() {
        return "Hulajnoga Elektryczna";
    }

}
