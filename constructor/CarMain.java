//  Exercise 7: Car
// Create a class Car.
// Variables:
// String brand;
// String model;
// double price;
// Create a constructor.
// Methods:
// void displayCar()
// void applyDiscount(double percentage) 


class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price = price - discountAmount;
        System.out.println("Applied a " + percentage + "% discount!");
    }

   
    void displayCar() {
        System.out.println("=== Car Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: BDT " + price);
        System.out.println("-----------------------");
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2000000);
       
        car1.displayCar();

        car1.applyDiscount(10);

        car1.displayCar();
    }
}
