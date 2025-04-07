package Zadanie1;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public void refuel(double amount) {
        if (amount + currentLevel > capacity) {
            currentLevel = capacity;
        } else {
            currentLevel += amount;
        }
        System.out.println("Zatankowano. Obecny poziom paliwa: " + currentLevel + " L");
    }

    public void consume(double amount) {
        if (amount > currentLevel) {
            System.out.println("Za mało paliwa!");
        } else {
            currentLevel -= amount;
            System.out.println("Zużyto " + amount + " L paliwa. Pozostało: " + currentLevel + " L");
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }
}

