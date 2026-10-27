/*
 * ==================== QUESTION ====================
 * Exercise 7: Online Shopping Product System
 * Create a superclass Product containing productName and price. Create two subclasses:
 * - Electronics with warrantyYears.
 * - Clothing with discountPercentage.
 * Requirements:
 * 1. Use constructors to initialize all attributes.
 * 2. Call the superclass constructor using super().
 * 3. Define a method getFinalPrice() in the superclass that returns the original price.
 * 4. Override getFinalPrice() in Electronics to add a 10% service charge.
 * 5. Override getFinalPrice() in Clothing to apply the given discount.
 * 6. Print the product details and final price.
 * Challenge: Create an array of type Product containing both electronics and clothing
 *     objects.
 * =================================================
 */


class Product {
    protected String productName;
    protected double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double getFinalPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.printf("Product: %s | Price: %.2f | Final Price: %.2f%n",
                productName, price, getFinalPrice());
    }
}

class Electronics extends Product {
    private int warrantyYears;

    public Electronics(String productName, double price, int warrantyYears) {
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double getFinalPrice() {
        return price + price * 0.10;
    }

    @Override
    public void displayDetails() {
        System.out.println("Category: Electronics (warranty: " + warrantyYears
                + " year(s), +10% service charge)");
        super.displayDetails();
    }
}

class Clothing extends Product {
    private double discountPercentage;

    public Clothing(String productName, double price, double discountPercentage) {
        super(productName, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    @Override
    public void displayDetails() {
        System.out.println("Category: Clothing (discount: " + discountPercentage + "%)");
        super.displayDetails();
    }
}

public class ProductShopping {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 80000, 2),
            new Electronics("Smartphone", 30000, 1),
            new Clothing("T-Shirt", 1200, 10),
            new Clothing("Jeans", 2500, 20)
        };

        for (Product product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}
