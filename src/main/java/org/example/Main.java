package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    //instantiating new Vehicle
        Vehicle vehicle = new Vehicle(4, "Blue", 2.6f, "Gas");
        System.out.println("Vehicle Info: ");
        System.out.println("Number of wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());
        System.out.println();


        //Instantiating new Car
        Car car = new Car(4, "Black", 4.0f, "Diesel", "Honda");
        System.out.println("Car info: ");
        car.displayInfo();
        car.honk();
    }
}