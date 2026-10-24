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
class MobilePhone {
    private String brand;
    private String model;
    private int batteryPercentage;   // always kept between 0 and 100
    private boolean isPoweredOn;

    public MobilePhone(String brand, String model, int batteryPercentage,
                       boolean isPoweredOn) {
        if (batteryPercentage < 0 || batteryPercentage > 100) {
            throw new IllegalArgumentException("Battery must be between 0 and 100");
        }
        if (isPoweredOn && batteryPercentage == 0) {
            throw new IllegalArgumentException("A phone with 0% battery cannot be on");
        }
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        this.isPoweredOn = isPoweredOn;
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

    public boolean isPoweredOn() {
        return isPoweredOn;
    }

    // No setBatteryPercentage(): the level changes only by charging or using the phone.

    public void chargeBattery(int amount) {
        if (amount <= 0) {
            System.out.println("Error: charge amount must be positive.");
            return;
        }
        batteryPercentage = Math.min(100, batteryPercentage + amount);
        System.out.println("Charged. Battery: " + batteryPercentage + "%");
    }

    public void useBattery(int amount) {
        if (amount <= 0) {
            System.out.println("Error: usage amount must be positive.");
            return;
        }
        batteryPercentage = Math.max(0, batteryPercentage - amount);
        System.out.println("Used battery. Battery: " + batteryPercentage + "%");
        if (batteryPercentage == 0 && isPoweredOn) {
            isPoweredOn = false;
            System.out.println("Battery empty: the phone shut down.");
        }
    }

    public void powerOn() {
        if (batteryPercentage == 0) {
            System.out.println("Cannot power on: battery is 0%.");
        } else if (isPoweredOn) {
            System.out.println("The phone is already on.");
        } else {
            isPoweredOn = true;
            System.out.println("Phone powered on.");
        }
    }

    public void powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false;
            System.out.println("Phone powered off.");
        } else {
            System.out.println("The phone is already off.");
        }
    }
}

public class MobilePhoneBattery {
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
