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
public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
            new Bus("BUS-101", 20, 50),
            new Taxi("TAXI-77", 12, 100),
            new Train("TRN-9", 150, 80)
        };

        // A loop displays the details (and the calculated fare) of each object
        for (Transport t : transports) {
            t.displayDetails();
            System.out.println();
        }
    }
}
