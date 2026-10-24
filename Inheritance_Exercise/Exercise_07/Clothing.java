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
public class Clothing extends Product {
    private double discountPercentage;

    public Clothing(String productName, double price, double discountPercentage) {
        super(productName, price);
        this.discountPercentage = discountPercentage;
    }

    // the given discount is subtracted from the price
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
