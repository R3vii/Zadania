package Zadanie1;

public interface Wypozyczony {
    double obliczKosztWynajmu(int godziny);

    default String getTypPojazdu(){
        return "Pojazd";
    }
}
