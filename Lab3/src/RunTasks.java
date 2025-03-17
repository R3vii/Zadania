import java.util.Scanner;
import tasks.TaskArr;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    TaskArr tasks = new TaskArr();

    public void Run() {
        while (true) {
            System.out.println("\nWybierz zadanie do wykonania:");
            System.out.println("1. Zadanie 1");
            System.out.println("2. Zadanie 2");
            System.out.println("3. Zadanie 3");
            System.out.println("4. Zadanie 4");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("7. Zadanie 7");
            System.out.println("8. Wyjście");

            System.out.print("Twój wybór: ");
            int wybor = input.nextInt();

            if (wybor == 8) {
                System.out.println("Zakończenie programu.");
                return;
            }

            switch (wybor) {
                case 1 -> tasks.Task206();
                case 2 -> tasks.Task207();
                case 3 -> tasks.Task208();
                case 4 -> tasks.Task209();
                case 5 -> tasks.Task210();
                case 6 -> tasks.Task211();
                case 7 -> tasks.Task212();
                default -> System.out.println("Nieprawidłowy wybór.");
            }
        }
    }
}


