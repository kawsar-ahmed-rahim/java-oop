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
public class Electronics extends Product {
    private int warrantyYears;

    public Electronics(String productName, double price, int warrantyYears) {
        super(productName, price);
        this.warrantyYears = warrantyYears;
    }

    // 10% service charge is added to the price
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
