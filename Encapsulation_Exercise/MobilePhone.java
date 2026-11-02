/*
 * ==================== QUESTION ====================
 * Exercise 6: Mobile Phone Battery Management
 * Create a class named MobilePhone containing private attributes brand, model,
 *     batteryPercentage, and isPoweredOn.
 * Requirements:
 * 1. Initialize all attributes using a constructor.
 * 2. Provide getter methods for all attributes.
 * 3. batteryPercentage must always remain between 0 and 100.
 * 4. Do not provide a public setter for the battery percentage.
 * 5. Create chargeBattery(int amount) to increase battery percentage without exceeding
 *     100.
 * 6. Create useBattery(int amount) to decrease battery percentage without going below
 *     zero.
 * 7. Create powerOn() and powerOff() methods.
 * 8. A phone cannot be powered on when the battery is 0%.
 * =================================================
 */


class MobilePhone {

    private String brand;
    private String model;
    private int batteryPercentage;
    private boolean isPoweredOn;

    MobilePhone(String brand, String model, int batteryPercentage, boolean isPoweredOn) {
        this.brand = brand;

        this.model = model;

        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        } else {
            this.batteryPercentage = 0;
            System.out.println("Error: Invalid battery percentage!");
        }

        this.isPoweredOn = isPoweredOn && this.batteryPercentage > 0;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public boolean getIsPoweredOn() {
        return isPoweredOn;
    }

    public void chargeBattery(int amount) {
        if (amount > 0) {
            batteryPercentage += amount;

            if (batteryPercentage > 100) {
                batteryPercentage = 100;
            }

            System.out.println("Battery charged successfully!");
        } else {
            System.out.println("Error: Charge amount must be positive!");
        }
    }

    public void useBattery(int amount) {
        if (amount > 0) {
            batteryPercentage -= amount;

            if (batteryPercentage < 0) {
                batteryPercentage = 0;
            }

            if (batteryPercentage == 0) {
                isPoweredOn = false;
            }

            System.out.println("Battery used successfully!");
        } else {
            System.out.println("Error: Amount must be positive!");
        }
    }

    public void powerOn() {
        if (batteryPercentage > 0) {
            isPoweredOn = true;
            System.out.println("Phone powered on!");
        } else {
            System.out.println("Error: Battery is empty!");
        }
    }

    public void powerOff() {
        isPoweredOn = false;
        System.out.println("Phone powered off!");
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Battery: " + getBatteryPercentage() + "%");
        System.out.println("Powered On: " + getIsPoweredOn());
    }

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S24", 50, true);

        System.out.println("Initial Phone Information:");
        phone.displayInfo();

        System.out.println("\nAfter Charging:");

        phone.chargeBattery(30);
        phone.displayInfo();

        System.out.println("\nAfter Using Battery:");

        phone.useBattery(40);
        phone.displayInfo();

        System.out.println("\nAfter Powering Off:");

        phone.powerOff();
        phone.displayInfo();

        System.out.println("\nTesting Empty Battery:");

        phone.useBattery(100);
        phone.powerOn();
        phone.displayInfo();
    }
}

