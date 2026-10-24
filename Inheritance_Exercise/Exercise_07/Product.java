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

// ANSWER
public class Product {
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
