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

// ANSWER
public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy A54", 15, false);
        System.out.println(phone.getBrand() + " " + phone.getModel()
                + " | battery: " + phone.getBatteryPercentage()
                + "% | on: " + phone.isPoweredOn());

        System.out.println();
        phone.powerOn();
        phone.useBattery(20);      // would go below 0, stops at 0 and shuts down
        phone.powerOn();           // rejected: battery is 0%

        System.out.println();
        phone.chargeBattery(50);
        phone.powerOn();
        phone.chargeBattery(80);   // would exceed 100, stops at 100
        phone.chargeBattery(-5);   // rejected

        System.out.println();
        phone.powerOff();
        System.out.println("Final state -> battery: " + phone.getBatteryPercentage()
                + "%, on: " + phone.isPoweredOn());
    }
}
