// Exercise 6: Product
// Create a class Product.
// Variables:
// String productName;
// double price;
// int quantity;
// Create a constructor.
// Add methods:
// double calculateTotalPrice()
// void displayProduct()
// Formula:
// Total Price = price × quantity

class Product {
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product Details:");
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price  : " + calculateTotalPrice());
    }
}

public class ProductMain {
    public static void main(String[] args) {

        Product p1 = new Product("Bluetooth Headphones", 2000.0, 5);

        p1.displayProduct();
    }
}
