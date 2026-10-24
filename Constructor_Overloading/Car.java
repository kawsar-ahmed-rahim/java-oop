// Exercise 9: Car Rental
// Create a class Car.
// Variables:
// String brand;
// String model;
// double rentPerDay;
// Constructor overloading:
// Car(String brand)
// Car(String brand, String model)
// Car(String brand, String model, double rentPerDay)
// Method overloading:
// double calculateRent(int days)
// double calculateRent(int days, double discount)
// double calculateRent(int days, double discount, double serviceCharge)

class Car {
    String brand;
    String model;
    double rentPerDay;

    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.rentPerDay = 0;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.rentPerDay = 0;
    }

    Car(String brand, String model, double rentPerDay) {
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    double calculateRent(int days) {
        return days * rentPerDay;
    }

    double calculateRent(int days, double discount) {
        double total = days * rentPerDay;
        return total - discount;
    }

    double calculateRent(int days, double discount, double serviceCharge) {
        double total = days * rentPerDay;
        total = total - discount;
        total = total + serviceCharge;
        return total;
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2000.0);
        System.out.println("Rent: " + car.calculateRent(5));
        System.out.println("Rent with discount: " + car.calculateRent(5, 1000));
        System.out.println("Rent with discount and service charge: " + car.calculateRent(5, 1000, 500));
    }
}