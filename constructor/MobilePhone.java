// Exercise 9: Mobile Phone
// Create a class Mobile.
// Variables:
// String brand;
// String model;
// double price;
// int batteryLevel;
// Create a constructor.
// Methods:
// void displayMobile()
// void charge(int amount)
// void useBattery(int amount)
// Rules:
// •
// Battery cannot exceed 100.
// •
// Battery cannot go below 0.


class Mobile {
    String brand;
    String model;
    double price;
    int batteryLevel;

    
    Mobile(String brand, String model, double price, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryLevel = batteryLevel;
    }

    void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    void charge(int amount) {
        batteryLevel = batteryLevel + amount;

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
    }

    void useBattery(int amount) {
        batteryLevel = batteryLevel - amount;

        if (batteryLevel < 0) {
            batteryLevel = 0;
        }
    }
}

public class MobilePhone {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("Samsung", "Galaxy S24", 85000, 50);

        mobile.displayMobile();

        mobile.charge(30);

        System.out.println("\nAfter charging:");
        mobile.displayMobile();

        mobile.useBattery(90);

        System.out.println("\nAfter using battery:");
        mobile.displayMobile();
    }
}

