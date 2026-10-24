/*
 * ==================== QUESTION ====================
 * Exercise 3: Flight Reservation System
 * Base class: Flight
 * - Instance variables:
 *    - flightNumber (int)
 *    - distance (double, in kilometers)
 *    - baseFare (double)
 * - Constructor:
 *    - Initialize all variables and print "Flight constructor called".
 * - Method:
 *    - calculateFare() -> computes the total fare as distance x baseFare and returns it.
 * Derived class 1: DomesticFlight (extends Flight)
 * - Instance variable:
 *    - serviceCharge (double)
 * - Constructor:
 *    - Call the parent constructor using super() and print "DomesticFlight constructor
 *        called".
 * - Method Overriding:
 *    - Override calculateFare() to include a smaller fixed service charge:
 *       - Call super.calculateFare() for the base amount.
 *       - Add serviceCharge.
 *       - Print "Domestic flight fare calculated including service charge."
 *       - Return the total fare.
 * Derived class 1: InternationalFlight (extends Flight)
 * - Instance variable:
 *    - internationalTax (double)
 * - Constructor:
 *    - Call the parent constructor using super() and print "InternationalFlight
 *        constructor called".
 * - Method Overriding:
 *    - Override calculateFare() to include international tax:
 *       - Call super.calculateFare() to get the base amount.
 *       - Add internationalTax to it.
 *       - Print "International flight fare calculated including international tax."
 *       - Return the total fare.
 * Main method tasks:
 * 1. Create one InternationalFlight and one DomesticFlight object using sample data (e.g.,
 *    - International: flightNumber = 1050, distance = 2500, baseFare = 0.25,
 *        internationalTax = 500.
 *    - Domestic: flightNumber = 215, distance = 800, baseFare = 0.20, serviceCharge =
 *        100.)
 * 2. For both objects:
 *    - Observe constructor messages showing hierarchical constructor chaining (Flight ->
 *        subclass).
 *    - Call calculateFare() on each and print the final fare amount.
 * 3. Explain how method overriding lets each subclass modify the parent's logic
 *     differently while reusing the super.calculateFare() computation.
 * =================================================
 */

// ANSWER
public class InternationalFlight extends Flight {
    private double internationalTax;

    public InternationalFlight(int flightNumber, double distance, double baseFare,
                               double internationalTax) {
        super(flightNumber, distance, baseFare);
        this.internationalTax = internationalTax;
        System.out.println("InternationalFlight constructor called");
    }

    @Override
    public double calculateFare() {
        double baseAmount = super.calculateFare();   // reuse the parent's logic
        double total = baseAmount + internationalTax;
        System.out.println("International flight fare calculated including international tax.");
        return total;
    }
}
