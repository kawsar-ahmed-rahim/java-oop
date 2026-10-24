/*
 * ==================== QUESTION ====================
 * Exercise 1: Vehicle Management System
 * 1. Base class: Vehicle
 *    - Instance variables: brand, model
 *    - Constructor: initialize both and print "Vehicle constructor called".
 * 2. Derived class: Car (extends Vehicle)
 *    - Instance variable: numberOfDoors
 *    - Constructor: use super() to call the Vehicle constructor and print "Car constructor
 *        called".
 * 3. Method: displayDetails() in Car that prints all details.
 * 4. Main method:
 *    - Create a Car object with sample data.
 *    - Call displayDetails().
 * =================================================
 */

// ANSWER
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);       // calls the Vehicle constructor first
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }

    public void displayDetails() {
        System.out.println("Brand          : " + brand);
        System.out.println("Model          : " + model);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
