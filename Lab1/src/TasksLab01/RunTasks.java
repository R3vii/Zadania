package TasksLab01;

import java.util.Scanner;

public class RunTasks {

    private Scanner input = new Scanner(System.in);
    private Tasks tasks = new Tasks();

    public void Run() {
        MenuView();
    }

    private void MenuView() {
        System.out.println("Laboratorium 1\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.print("Wybierz, które zadanie rozwiązać: ");

        int wybor = InputInt();
        switch (wybor) {
            case 1:
                System.out.println(tasks.Task001());
                break;
            case 2:
                System.out.println("Podaj dwie liczby:");
                double value1 = InputDouble();
                double value2 = InputDouble();
                tasks.Task002(value1, value2);
                break;
            case 3:
                System.out.println("Podaj liczbę do sprawdzenia:");
                int number1 = InputInt();
                System.out.println("Czy liczba jest parzysta? " + tasks.Task003(number1));
                break;
            case 4:
                System.out.println("Podaj liczbę do sprawdzenia:");
                int number2 = InputInt();
                System.out.println("Czy liczba jest podzielna przez 3 i 5? " + tasks.Task004(number2));
                break;
            case 5:
                System.out.println("Podaj liczbę do podniesienia do 3 potęgi:");
                int number3 = InputInt();
                System.out.println("Liczba podniesiona do 3 potęgi: " + tasks.Task005(number3));
                break;
            case 6:
                System.out.println("Podaj liczbę, z której chcesz obliczyć pierwiastek:");
                int number4 = InputInt();
                System.out.println("Pierwiastek kwadratowy: " + tasks.Task006(number4));
                break;
            case 7:
                System.out.println("Podaj trzy liczby do sprawdzenia (odcinki):");
                int a = InputInt();
                int b = InputInt();
                int c = InputInt();
                System.out.println("Czy z tych odcinków można zbudować trójkąt prostokątny? " + tasks.Task007(a, b, c));
                break;
            case 8:
                System.out.println("Kończę program...");
                break;
            default:
                System.out.println("Nieznana opcja.");
                break;
        }
    }

    private int InputInt() {
        return input.nextInt();
    }

    private double InputDouble() {
        return input.nextDouble();
    }
}

