/*
 * ==================== QUESTION ====================
 * Exercise 2: Vehicle and Car
 * Create a superclass Vehicle containing brand and speed. Create a subclass Car with an
 *     additional attribute numberOfDoors.
 * Requirements:
 * 1. Initialize brand and speed through the superclass constructor.
 * 2. Call the superclass constructor using super().
 * 3. Define a method startEngine() in Vehicle that prints "Vehicle engine starting".
 * 4. Override startEngine() in Car to print "Car engine starting with key".
 * 5. Create a Car object and call startEngine().
 * Challenge: Inside the overridden method, call super.startEngine() before printing the
 *     car-specific message.
 * =================================================
 */

// ANSWER
public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void startEngine() {
        System.out.println("Vehicle engine starting");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
