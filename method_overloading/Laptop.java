// Exercise 10 (Challenge): Constructor Chaining
// Create a class Laptop with overloaded constructors that use constructor chaining (this() keyword):
// 1. No-argument constructor → default brand = "Unknown", RAM = 4 GB.
// 2. Constructor with brand.
// 3. Constructor with brand and RAM.
// 4. Constructor with brand, RAM, and price.
// Add a method showSpecs() to print laptop details.

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop() {
        this("Unknown", 4);
    }

    Laptop(String brand) {
        this(brand, 4);
    }

    Laptop(String brand, int ram) {
        this(brand, ram, 0);
    }

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void showSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 8, 55000);
        laptop.showSpecs();
    }
}
