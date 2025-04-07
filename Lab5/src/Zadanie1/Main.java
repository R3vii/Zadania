package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(150, "Benzyna");
        FuelTank carTank = new FuelTank(50);
        Car car = new Car("Toyota", "Corolla", 2020, 180, 5, carEngine, carTank);

        Engine truckEngine = new Engine(400, "Diesel");
        FuelTank truckTank = new FuelTank(150);
        Truck truck = new Truck("Volvo", "FH16", 2018, 140, 20, truckEngine, truckTank);

        System.out.println("\nSamochód osobowy:");
        car.displayInfo();
        car.startEngine();
        car.refuel(40);
        car.consume(15);

        System.out.println("\nCiężarówka:");
        truck.displayInfo();
        truck.startEngine();
        truck.refuel(120);
        truck.consume(50);
    }
}
