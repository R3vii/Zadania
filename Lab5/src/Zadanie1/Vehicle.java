package Zadanie1;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double maxSpeed;
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, String model, int year, double maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo() {
        System.out.println("Marka: " + brand + ", Model: " + model + ", Rok: " + year + ", Max prędkość: " + maxSpeed + " km/h");
        engine.displayInfo();
        System.out.println("Zbiornik paliwa: " + fuelTank.getCapacity() + " L, Aktualny poziom: " + fuelTank.getCurrentLevel() + " L");
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void refuel(double amount) {
        fuelTank.refuel(amount);
    }

    public void consume(double amount) {
        fuelTank.consume(amount);
    }
}
