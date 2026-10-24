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
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        System.out.println();
        car.displayDetails();
    }
}
