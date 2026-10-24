/*
 * ===================== QUESTION =====================
 * Exercise 1: Vehicle Management System
 *
 * Base class: Vehicle
 *   - Instance variables: brand, model
 *   - Constructor: initialize both and print "Vehicle constructor called".
 *
 * Derived class: Car (extends Vehicle)
 *   - Instance variable: numberOfDoors
 *   - Constructor: use super() to call the Vehicle constructor and
 *     print "Car constructor called".
 *   - Method: displayDetails() in Car that prints all details.
 *
 * Main method:
 *   - Create a Car object with sample data.
 *   - Call displayDetails().
 * ====================================================
 */

// Base class (public -> file name is Vehicle.java)
public class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Vehicle constructor called");
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);   // sample data
        car.displayDetails();
    }
}

// Derived class (non-public, so it can live in the same file)
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);                 // call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }

    public void displayDetails() {
        System.out.println("Brand          : " + brand);
        System.out.println("Model          : " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
