package Zadanie2;

public class Main {
    public static void main(String[] args) {
        // Test Punkt
        Punkt p1 = new Punkt(5, 10);
        p1.opis();
        p1.przesun(2, 3);
        p1.opis();

        // Test Figura
        Figura figura = new Figura(p1);
        System.out.println(figura.opis());

        // Test Prostokat
        Prostokat prostokat = new Prostokat(4, 7);
        System.out.println("Powierzchnia prostokąta: " + prostokat.getPowierzchnia());

        // Test Trojkat
        Trojkat trojkat = new Trojkat(5, 3);

        // Test Okrag
        Okrag okrag = new Okrag(new Punkt(0, 0), 5);
        System.out.println(okrag.opis());
        System.out.println("Punkt (3,4) w środku? " + okrag.wSrodku(new Punkt(3, 4)));

        // Test Kwadrat
        Kwadrat kwadrat = new Kwadrat(6);
        System.out.println(kwadrat.opis());
    }
}

