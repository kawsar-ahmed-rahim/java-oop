// 1.Create a Car class with three attributes: brand, model, and year.

// Add a method displayInfo() that prints all details.
// Create two Car objects in the main method and call displayInfo() for each.

class Car {
    String brand;
    String model;
    int year;

   

    void displayInfo() {
        System.out.println("===Car Information===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("-----------------------");
    }
}

public class CarClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2022;

        car2.brand = "Honda";
        car2.model = "Civic";
        car2.year = 2020;

        car1.displayInfo();
        car2.displayInfo();
    }
}
