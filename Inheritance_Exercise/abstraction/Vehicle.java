// Exercise 3: Vehicle
// Create an abstract class Vehicle with:
// •
// A variable brand.
// •
// A constructor to initialise brand.
// •
// An abstract method startEngine().
// •
// A concrete method displayBrand().
// Create subclasses Car and Motorcycle and implement the abstract method.


abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a button.");
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota");
        Motorcycle motorcycle = new Motorcycle("Yamaha");

        car.displayBrand();
        car.startEngine();

        System.out.println();

        motorcycle.displayBrand();
        motorcycle.startEngine();
    }
}
