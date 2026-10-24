// Exercise 5: Mobile Phone
// Create a class Mobile.
// Variables:
// String brand;
// String model;
// double price;
// Constructor overloading:
// Mobile(String brand)
// Mobile(String brand, String model)
// Mobile(String brand, String model, double price)
// Method overloading:
// void show()
// void show(String heading)
// void show(String heading, boolean showPrice)

class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 0;
    }

    Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0;
    }

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    void show(String heading) {
        System.out.println(heading);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    void show(String heading, boolean showPrice) {
        System.out.println(heading);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        if (showPrice) {
            System.out.println("Price: " + price);
        }
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", "Galaxy", 25000.0);
        mobile.show();
        mobile.show("Mobile Details");
        mobile.show("Mobile Details", true);
    }
}