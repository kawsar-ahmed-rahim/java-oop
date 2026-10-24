// 6.Create a Product class with fields: name, price, discountPercentage.

// Assign values directly in main.

// Write a method calculateDiscountedPrice() to print the price after discount.

// use constructor

class Product {
    String name;
    double price;
    double discountPercentage;

    Product(String name,
            double price,
            double discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    void calculateDiscountedPrice() {
        double discountedPrice = price - (price * discountPercentage / 100);
        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

public class ProductDiscountConstructor {
    public static void main(String[] args) {
        Product p = new Product("Bluetooth Headphones", 2000, 15);
        p.calculateDiscountedPrice();
    }
}
