package Zadanie1;

public class Rower extends Pojazd implements Wypozyczony{
    private static final double Stawka_Godzinowa = 10.0;

    public Rower(String nazwa) {
        super(nazwa);
    }

    @Override
    public double obliczKosztWynajmu(int godziny) {
        return godziny * Stawka_Godzinowa;
    }

    @Override
    public String getTypPojazdu() {
        return "Rower";
    }
}
