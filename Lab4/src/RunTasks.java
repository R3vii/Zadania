import java.util.Scanner;

public class RunTasks {
    private Scanner input = new Scanner(System.in);
    private Tasks tasks = new Tasks();

    public void Run() {
        MenuView();
    }

    private void MenuView() {
        System.out.println("Laboratorium 1\n");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("0. Wyjście");
        System.out.print("Wybierz zadanie: ");

        int wybor = InputInt();
        switch (wybor) {
            case 1:
                tasks.Task001();
                break;
            case 2:
                tasks.Task002();
                break;
            case 3:
                tasks.Task003();
                break;
            case 4:
                tasks.Task004();
                break;
            case 0:
                System.out.println("Koniec programu.");
                break;
            default:
                System.out.println("Nieprawidłowy wybór!");
                break;
        }

        if (wybor != 0) {
            System.out.println("\nNaciśnij Enter, aby wrócić do menu...");
            input.nextLine();
            input.nextLine(); // Dwa razy, aby "zjeść" poprzedni enter
            Run(); // Rekurencyjne wywołanie menu
        }
    }

    private int InputInt() {
        while (!input.hasNextInt()) {
            System.out.println("To nie jest liczba!");
            input.next();
        }
        return input.nextInt();
    }
}