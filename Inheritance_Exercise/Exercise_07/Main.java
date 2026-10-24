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
public class Main {
    public static void main(String[] args) {
        // Challenge: one array of type Product holding both kinds of objects
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
