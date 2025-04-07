package Zadanie1;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String brand, String model, int year, double maxSpeed, int passengerCapacity, Engine engine, FuelTank fuelTank) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pojemność pasażerska: " + passengerCapacity + " osób");
    }
}

