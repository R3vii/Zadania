package Zadanie2;

public class Okrag {
    Punkt srodek;
    double promien;

    public Okrag() {
        this.srodek = new Punkt(0, 0);
        this.promien = 0;
    }

    public Okrag(Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * promien * promien;
    }

    public double getSrednica() {
        return 2 * promien;
    }

    public void setPromien(double p) {
        this.promien = p;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt p) {
        double dx = p.x - srodek.x;
        double dy = p.y - srodek.y;
        return dx * dx + dy * dy <= promien * promien;
    }

    public String opis() {
        return "Okrąg o środku w punkcie (" + srodek.x + ", " + srodek.y + ") i promieniu " + promien;
    }
}

