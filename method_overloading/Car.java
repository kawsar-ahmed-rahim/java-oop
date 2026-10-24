// Exercise 6: Car
// Create a class Car with overloaded constructors:
// 1. No-argument constructor → default brand = "Unknown", model = "Unknown".
// 2. Constructor with brand.
// 3. Constructor with brand and model.
// 4. Constructor with brand, model, and year.
// Add a method displayCar() to show car details.

class Car {
    String brand;
    String model;
    int year;

    Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = 0;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        car.displayCar();
    }
}
