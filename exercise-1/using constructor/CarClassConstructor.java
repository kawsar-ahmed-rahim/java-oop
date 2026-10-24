// 1.Create a Car class with three attributes: brand, model, and year.

// Add a method displayInfo() that prints all details.

// Create two Car objects in the main method and call displayInfo() for each.

// use constructor

class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("===Car Information===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("-----------------------");
    }
}

public class CarClassConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        car1.displayInfo();
        car2.displayInfo();
    }
}
