// 6.Create a Product class with fields: name, price, discountPercentage.

// Assign values directly in main.

// Write a method calculateDiscountedPrice() to print the price after discount.

class Product {
    String name;
    double price;
    double discountPercentage;

    void calculateDiscountedPrice() {
        double discountedPrice = price - (price * discountPercentage / 100);
        System.out.println("Product: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Discounted Price: " + discountedPrice);
    }
}

public class ProductDiscount {
    public static void main(String[] args) {
        Product p = new Product();
        p.name = "Bluetooth Headphones";
        p.price = 2000;
        p.discountPercentage = 15;

        p.calculateDiscountedPrice();
    }
}
