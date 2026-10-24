/*
 * Exercise 1: Vehicle Management System
 * Derived class: Car (extends Vehicle)
 *   - Instance variable: numberOfDoors
 *   - Constructor uses super() and prints "Car constructor called".
 *   - displayDetails() prints all details.
 */
public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);                 // call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }

    public void displayDetails() {
        System.out.println("Brand         : " + brand);
        System.out.println("Model         : " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
