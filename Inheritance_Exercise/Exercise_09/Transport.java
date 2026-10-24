/*
 * ==================== QUESTION ====================
 * Exercise 9: Transport Fare Calculation System
 * Create a superclass Transport containing vehicleNumber, distance, and baseFare. Create
 *     three subclasses: Bus, Taxi, and Train.
 * Requirements:
 * 1. Define parameterized constructors for all classes.
 * 2. Each subclass must use super() to initialize common fields.
 * 3. Define calculateFare() in Transport returning baseFare.
 * 4. Override this method according to the following rules.
 * Transport   Fare formula
 * Bus         baseFare + distance x 5
 * Taxi        baseFare + distance x 20
 * Train       baseFare + distance x 3
 * 5. Store different transport objects inside a Transport[] array.
 * 6. Use a loop to display their calculated fares.
 * Challenge: Create an overridden displayDetails() method that calls calculateFare().
 * =================================================
 */

// ANSWER
public class Transport {
    protected String vehicleNumber;
    protected double distance;
    protected double baseFare;

    public Transport(String vehicleNumber, double distance, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return baseFare;
    }

    // Challenge: displayDetails() calls calculateFare(), so the overridden
    // version of the actual object's class is used.
    public void displayDetails() {
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Distance        : " + distance + " km");
        System.out.println("Calculated Fare : " + calculateFare());
    }
}
