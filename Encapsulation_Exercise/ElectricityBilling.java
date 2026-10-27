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

class ElectricityAccount {
    private final String meterNumber;     
    private String customerName;
    private double previousReading;       
    private double currentReading;

    public ElectricityAccount(String meterNumber, String customerName,
                              double previousReading, double currentReading) {
        if (meterNumber == null || meterNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Meter number must not be empty");
        }
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name must not be empty");
        }
        if (previousReading < 0) {
            throw new IllegalArgumentException("Previous reading must not be negative");
        }
        if (!(currentReading >= previousReading)) {
            throw new IllegalArgumentException(
                    "Current reading cannot be lower than the previous reading");
        }
        this.meterNumber = meterNumber;
        this.customerName = customerName.trim();
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPreviousReading() {
        return previousReading;
    }

    public double getCurrentReading() {
        return currentReading;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            System.out.println("Error: customer name cannot be empty.");
        } else {
            this.customerName = customerName.trim();
        }
    }

    public void setCurrentReading(double reading) {
        if (!(reading >= previousReading)) {
            System.out.println("Error: reading " + reading + " is lower than the previous "
                    + "reading (" + previousReading + "). Previous value kept.");
        } else {
            this.currentReading = reading;
        }
    }

    public double calculateBill() {
        double units = currentReading - previousReading;
        if (units <= 0) {
            return 0.0;
        }
        double bill;
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = 100 * 5 + (units - 100) * 7;
        } else {
            bill = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }
        return Math.max(0.0, bill);       
    }

    public void startNewBillingCycle() {
        previousReading = currentReading;
        System.out.println("New billing cycle started. Previous reading is now "
                + previousReading);
    }
}

public class ElectricityBilling {
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
        acc.setCurrentReading(900);               
        acc.setCurrentReading(Double.NaN);          
        acc.setCustomerName("  ");
        System.out.println("Bill is still: " + acc.calculateBill());

        System.out.println();
        System.out.println("Next billing cycle:");
        acc.startNewBillingCycle();
        acc.setCurrentReading(1320);                
        System.out.println("Units: " + (acc.getCurrentReading() - acc.getPreviousReading())
                + " -> bill: " + acc.calculateBill());

    
    }
}
