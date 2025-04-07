package Zadanie2;

public class Kwadrat {
    double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    public double getPowierzchnia() {
        return bok * bok;
    }

    public String opis() {
        return "Kwadrat o boku " + bok;
    }
}

