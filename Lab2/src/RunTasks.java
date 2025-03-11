import java.util.Scanner;
import tasks02.Tasks02;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    Tasks02 tasks02 = new Tasks02();

    public void Run() {
        while (true) {
            System.out.println("\nWybierz zadanie:");
            System.out.println("1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Wyjście");

            System.out.print("Twój wybór: ");
            int wybor = input.nextInt();
            if (wybor == 6) {
                System.out.println("Zakończenie programu.");
                return;
            }

            switch (wybor) {
                case 1 -> tasks02.Task201();
                case 2 -> tasks02.Task202();
                case 3 -> tasks02.Task203();
                case 4 -> tasks02.Task204();
                case 5 -> tasks02.Task205();
                default -> System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}
