package osoby;

public class Student {
    private String imie;
    private String nazwisko;
    private String nrIndeksu;
    private String specjalnosc;
    private int rokStudiow;

    public Student(String imie, String nazwisko, String nrIndeksu, String specjalnosc, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.specjalnosc = specjalnosc;
        this.rokStudiow = rokStudiow;
    }

    public Student(String imie, String nazwisko, String nrIndeksu) {
        this(imie, nazwisko, nrIndeksu, "", 0);
    }

    public Student(String nrIndeksu, String specjalnosc) {
        this("", "", nrIndeksu, specjalnosc, 0);
    }

    public Student(int rokStudiow, String imie) {
        this(imie, "", "", "", rokStudiow);
    }

    public void wyswietlDane() {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Nr indeksu: " + nrIndeksu);
        System.out.println("Specjalność: " + specjalnosc);
        System.out.println("Rok studiów: " + rokStudiow);
    }
}
