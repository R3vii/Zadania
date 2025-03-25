import osoby.Student;

import java.util.Scanner;

public class InputData {
    public static Student wprowadzDaneStudenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String imie = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.nextLine();

        System.out.println("Podaj nr indeksu:");
        String nrIndeksu = scanner.nextLine();

        System.out.println("Podaj specjalność:");
        String specjalnosc = scanner.nextLine();

        System.out.println("Podaj rok studiów:");
        int rokStudiow = scanner.nextInt();

        return new Student(imie, nazwisko, nrIndeksu, specjalnosc, rokStudiow);
    }
}
