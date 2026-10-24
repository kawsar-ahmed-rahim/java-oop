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
public class Product {
    private final int productId;
    private String productName;
    private double price;
    private int stockQuantity;      // changed only through addStock() / sellProduct()

    public Product(int productId, String productName, double price, int stockQuantity) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.productId = productId;
        this.productName = productName.trim();
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            System.out.println("Error: product name cannot be empty.");
        } else {
            this.productName = productName.trim();
        }
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Error: price must be greater than zero.");
        } else {
            this.price = price;
        }
    }

    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: quantity to add must be positive.");
        } else {
            stockQuantity += quantity;
            System.out.println("Added " + quantity + " unit(s). Stock: " + stockQuantity);
        }
    }

    public void sellProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: quantity to sell must be positive.");
        } else if (quantity > stockQuantity) {
            System.out.println("Sale rejected: requested " + quantity
                    + " but only " + stockQuantity + " in stock.");
        } else {
            stockQuantity -= quantity;
            System.out.println("Sold " + quantity + " unit(s). Stock: " + stockQuantity);
        }
    }
}
