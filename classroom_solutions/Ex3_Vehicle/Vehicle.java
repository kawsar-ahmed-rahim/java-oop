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
public class Vehicle {

    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Vehicle constructor called");
    }
}
