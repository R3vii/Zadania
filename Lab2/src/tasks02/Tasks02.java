package tasks02;

import java.util.Scanner;
import java.util.Random;

public class Tasks02 {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    public void Task201() {
        System.out.print("Podaj liczbę studentów: ");
        int n = input.nextInt();
        double suma = 0;
        int licznik = 0;

        while (licznik < n) {
            System.out.print("Podaj liczbę punktów studenta " + (licznik + 1) + ": ");
            suma += input.nextDouble();
            licznik++;
        }

        System.out.println("Średnia liczba punktów: " + (suma / n));
    }

    public void Task202() {
        int dodatnie = 0, ujemne = 0, sumaDodatnich = 0, sumaUjemnych = 0;
        System.out.println("Podaj 10 liczb:");

        for (int i = 0; i < 10; i++) {
            int liczba = input.nextInt();
            if (liczba > 0) {
                dodatnie++;
                sumaDodatnich += liczba;
            } else if (liczba < 0) {
                ujemne++;
                sumaUjemnych += liczba;
            }
        }

        System.out.println("Liczby dodatnie: " + dodatnie + ", Suma: " + sumaDodatnich);
        System.out.println("Liczby ujemne: " + ujemne + ", Suma: " + sumaUjemnych);
    }

    public void Task203() {
        System.out.print("Podaj liczbę elementów ciągu: ");
        int n = input.nextInt();
        int suma = 0;

        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            int liczba = input.nextInt();
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb parzystych: " + suma);
    }

    public void Task204() {
        System.out.print("Podaj liczbę losowanych elementów: ");
        int n = input.nextInt();
        int suma = 0;

        System.out.println("Wylosowane liczby:");
        for (int i = 0; i < n; i++) {
            int liczba = random.nextInt(56) - 10; // zakres (-10, 45)
            System.out.print(liczba + " ");
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }

        System.out.println("\nSuma liczb parzystych: " + suma);
    }

    public void Task205() {
        System.out.print("Podaj słowo: ");
        String slowo = input.next();
        String odwrocone = new StringBuilder(slowo).reverse().toString();

        if (slowo.equalsIgnoreCase(odwrocone)) {
            System.out.println("Słowo jest palindromem.");
        } else {
            System.out.println("Słowo NIE jest palindromem.");
        }
    }
}
