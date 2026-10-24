// Exercise 4: Product
// Create a class Product.
// Variables:
// String name;
// double price;
// int quantity;
// Constructor overloading:
// Product(String name)
// Product(String name, double price)
// Product(String name, double price, int quantity)
// Create overloaded calculatePrice() methods:
// double calculatePrice()
// double calculatePrice(int quantity)
// double calculatePrice(int quantity, double discount)
// Rules:
// calculatePrice()= price × object quantity
// calculatePrice(quantity)= price × given quantity
// calculatePrice(quantity, discount)= total price after percentage discount

class Product {
    String name;
    double price;
    int quantity;

    Product(String name) {
        this.name = name;
        this.price = 0;
        this.quantity = 0;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculatePrice() {
        return price * quantity;
    }

    double calculatePrice(int quantity) {
        return price * quantity;
    }

    double calculatePrice(int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void main(String[] args) {
        Product product = new Product("Pen", 20.0, 10);
        System.out.println("Price: " + product.calculatePrice());
        System.out.println("Price with given quantity: " + product.calculatePrice(5));
        System.out.println("Price with discount: " + product.calculatePrice(5, 10));
    }
}