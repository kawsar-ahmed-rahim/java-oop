/*
 * ==================== QUESTION ====================
 * Exercise 4: Product Price and Stock Management
 * Create a class named Product containing the following private attributes: productId,
 *     productName, price, and stockQuantity.
 * Requirements:
 * 1. Create a constructor to initialize all attributes.
 * 2. Generate getters for all attributes.
 * 3. Generate setters for productName and price.
 * 4. A product price must be greater than zero.
 * 5. A product name cannot be empty.
 * 6. Do not provide a public setter for stockQuantity.
 * 7. Create addStock(int quantity) and sellProduct(int quantity) methods.
 * 8. Prevent selling more items than the available stock.
 * Sample scenario: A product has 20 units in stock. A customer purchases 5 units and then
 *     attempts to purchase 30 units.
 * Expected result: The second purchase is rejected, and the final stock remains 15.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Wireless Mouse", 850.0, 20);
        System.out.println("Initial stock: " + product.getStockQuantity());

        // Sample scenario from the question
        product.sellProduct(5);     // accepted
        product.sellProduct(30);    // rejected
        System.out.println("Final stock: " + product.getStockQuantity());

        System.out.println();
        System.out.println("Extra validation checks:");
        product.setPrice(0);
        product.setProductName("");
        product.addStock(0);
        product.addStock(10);
        System.out.println(product.getProductName() + " | price: " + product.getPrice()
                + " | stock: " + product.getStockQuantity());
    }
}
