package TasksLab01;

public class Tasks {

    public String Task001() {
        return "Jan, 23";
    }

    public void Task002(double value1, double value2) {
        System.out.println("Suma " + value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.println("Różnica " + value1 + " - " + value2 + " = " + (value1 - value2));
        System.out.println("Iloczyn " + value1 + " * " + value2 + " = " + (value1 * value2));
        if (value2 != 0)
            System.out.println("Iloraz " + value1 + " / " + value2 + " = " + (value1 / value2));
        else
            System.out.println("Nie można dzielić przez zero");
    }

    public boolean Task003(int number) {
        return number % 2 == 0;
    }

    public boolean Task004(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public double Task005(int number) {
        return Math.pow(number, 3);
    }

    public double Task006(int number) {
        if (number < 0) {
            System.out.println("Liczba nie może być ujemna.");
            return -1;
        }
        return Math.sqrt(number);
    }

    public boolean Task007(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }
}

