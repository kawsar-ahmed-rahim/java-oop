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
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);       // superclass constructor initializes brand and speed
        this.numberOfDoors = numberOfDoors;
    }

    // Challenge: call the parent version first, then add the car-specific message
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car engine starting with key");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
