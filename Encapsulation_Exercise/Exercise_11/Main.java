/*
 * ==================== QUESTION ====================
 * Exercise 11: Electricity Billing System
 * Create a class named ElectricityAccount containing private attributes meterNumber,
 *     customerName, previousReading, and currentReading.
 * Requirements:
 * 1. Initialize all attributes using a constructor.
 * 2. Make meterNumber read-only.
 * 3. Provide getters for all attributes.
 * 4. Validate customerName using a setter.
 * 5. Create setCurrentReading(double reading) with validation so that the new reading
 *     cannot be lower than the previous reading.
 * 6. Do not provide a public setter for previousReading.
 * 7. Create calculateBill() using the following rates:
 * Units consumed    Rate per unit
 * First 100 units   5
 * Next 100 units    7
 * Above 200 units   10
 * 8. Create startNewBillingCycle() to save the current reading as the previous reading.
 * Challenge: Ensure the bill cannot become negative, even when invalid input is attempted.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        ElectricityAccount acc = new ElectricityAccount("MTR-5001", "Rahim", 1000, 1250);
        System.out.println(acc.getMeterNumber() + " | " + acc.getCustomerName()
                + " | previous " + acc.getPreviousReading()
                + " | current " + acc.getCurrentReading());
        System.out.println("Units: " + (acc.getCurrentReading() - acc.getPreviousReading())
                + " -> bill: " + acc.calculateBill());
        System.out.println("(100 x 5) + (100 x 7) + (50 x 10) = " + (500 + 700 + 500));

        System.out.println();
        System.out.println("Invalid input attempts:");
        acc.setCurrentReading(900);                 // lower than the previous reading
        acc.setCurrentReading(Double.NaN);          // not a number
        acc.setCustomerName("  ");
        System.out.println("Bill is still: " + acc.calculateBill());

        System.out.println();
        System.out.println("Next billing cycle:");
        acc.startNewBillingCycle();
        acc.setCurrentReading(1320);                // 70 units, all in the first slab
        System.out.println("Units: " + (acc.getCurrentReading() - acc.getPreviousReading())
                + " -> bill: " + acc.calculateBill());

        // acc.previousReading = 0;     // compile error: private
        // acc.setMeterNumber("X");     // compile error: no such method
    }
}
