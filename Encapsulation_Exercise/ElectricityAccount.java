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

    private String meterNumber;
    private String customerName;
    private double previousReading;
    private double currentReading;

    ElectricityAccount(String meterNumber, String customerName,
                       double previousReading, double currentReading) {

        this.meterNumber = meterNumber;
        this.customerName = customerName;

        if (previousReading >= 0 && currentReading >= previousReading) {
            this.previousReading = previousReading;
            this.currentReading = currentReading;
        } else {
            this.previousReading = 0;
            this.currentReading = 0;
            System.out.println("Error: Invalid meter readings!");
        }
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
        if (customerName != null && !customerName.trim().isEmpty()) {
            this.customerName = customerName;
        } else {
            System.out.println("Error: Invalid customer name!");
        }
    }

    public void setCurrentReading(double reading) {
        if (reading >= previousReading) {
            currentReading = reading;
        } else {
            System.out.println("Error: Reading cannot be lower than previous reading!");
        }
    }

    public double calculateBill() {

        double units = currentReading - previousReading;
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } 
        else if (units <= 200) {
            bill = (100 * 5) + (units - 100) * 7;
        } 
        else {
            bill = (100 * 5) + (100 * 7) + (units - 200) * 10;
        }

        return Math.max(0, bill);
    }

    public void startNewBillingCycle() {
        previousReading = currentReading;
        System.out.println("New billing cycle started!");
    }

    public void displayInfo() {
        System.out.println("Meter Number: " + getMeterNumber());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Previous Reading: " + getPreviousReading());
        System.out.println("Current Reading: " + getCurrentReading());
        System.out.println("Units Consumed: " + (getCurrentReading() - getPreviousReading()));
        System.out.println("Total Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        ElectricityAccount account = new ElectricityAccount("M101", "Rahim", 100, 250);

        System.out.println("Initial Electricity Account:");
        account.displayInfo();

        System.out.println("\nAfter Updating Customer Name:");

        account.setCustomerName("Karim");
        account.displayInfo();

        System.out.println("\nAfter Updating Current Reading:");

        account.setCurrentReading(350);
        account.displayInfo();

        System.out.println("\nTesting Invalid Reading:");

        account.setCurrentReading(200);
        account.displayInfo();

        System.out.println("\nStarting New Billing Cycle:");

        account.startNewBillingCycle();
        account.displayInfo();
    }
}
