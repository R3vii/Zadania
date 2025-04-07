package Zadanie1;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, double maxSpeed, double loadCapacity, Engine engine, FuelTank fuelTank) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ładowność: " + loadCapacity + " ton");
    }
}
