package Zadanie1;

public class Samochod extends Pojazd implements Wypozyczony {
    private static final double Stawka_Godzinowa = 50.0;

    public Samochod(String nazwa) {
        super(nazwa);
    }

    @Override
    public double obliczKosztWynajmu(int godziny) {
        return godziny * Stawka_Godzinowa;
    }

    @Override
    public String getTypPojazdu() {
        return "Samochód";
    }

}
