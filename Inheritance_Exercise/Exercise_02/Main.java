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
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);

        car.displayInfo();
        car.startEngine();
    }
}
