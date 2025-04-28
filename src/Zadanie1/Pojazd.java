package Zadanie1;

public abstract class Pojazd {
    private String nazwa;
    private boolean dostepny = true;

    //constructor Pojazd
    public Pojazd(String nazwa) {
        this.nazwa = nazwa;
    }
    //Getter nazwa
    public String getNazwa() {
        return nazwa;
    }
    //Getter dostepny
    public boolean isDostepny() {
        return dostepny;
    }

    //sprawdzanie czy wypozyczony czy nie
    public void wypozycz() {
        if (dostepny) {
            dostepny = false;
            System.out.println(nazwa + " został wypożyczony.");
        } else {
            System.out.println(nazwa + " jest już wypożyczony!");
        }
    }

    //funkcja do zwracania
    public void zwroc() {
        dostepny = true;
        System.out.println(nazwa + " został zwrócony");
    }

    //Metoda abstrakcyjna
    public abstract double obliczKosztWynajmu(int godziny);
}
