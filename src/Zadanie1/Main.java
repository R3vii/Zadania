package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Bugatti Veyron");
        Rower rower = new Rower("Giant Bike Mountain");
        HulajnogaElektryczna hulajnogaElektryczna = new HulajnogaElektryczna("XIAOMI");

        //WYPOŻYCZANE
        samochod.wypozycz();
        rower.wypozycz();
        hulajnogaElektryczna.wypozycz();

        //Kosz wynajmu
        System.out.println("Koszt wynajmu samochodu na 3h: " + samochod.obliczKosztWynajmu(3) + " zł");
        System.out.println("Koszt wynajmu roweru (2h): " + rower.obliczKosztWynajmu(2) + " zł");
        System.out.println("Koszt wynajmu hulajnogi (1h): " + hulajnogaElektryczna.obliczKosztWynajmu(1) + " zł");

        //Zwracanie
        samochod.zwroc();
        rower.zwroc();
        hulajnogaElektryczna.zwroc();
    }
}
