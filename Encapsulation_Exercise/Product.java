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


class Product {

    private int productId;
    private String productName;
    private double price;
    private int stockQuantity;

    Product(int productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
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
        if (productName != null && !productName.trim().isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Error: Invalid product name!");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be greater than zero!");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println("Stock added successfully!");
        } else {
            System.out.println("Error: Quantity must be positive!");
        }
    }

    public void sellProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println("Error: Quantity must be positive!");
        } 
        else if (quantity > stockQuantity) {
            System.out.println("Error: Not enough stock available!");
        } 
        else {
            stockQuantity -= quantity;
            System.out.println("Product sold successfully!");
        }
    }

    public void displayInfo() {
        System.out.println("Product ID: " + getProductId());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: " + getPrice());
        System.out.println("Stock Quantity: " + getStockQuantity());
    }

    public static void main(String[] args) {

        Product p = new Product(101, "Laptop", 50000, 20);

        System.out.println("Initial Product Information:");
        p.displayInfo();

        System.out.println("\nAfter Selling 5 Units:");

        p.sellProduct(5);
        System.out.println("Updated Stock: " + p.getStockQuantity());

        System.out.println("\nAfter Attempting to Sell 30 Units:");

        p.sellProduct(30);
        System.out.println("Updated Stock: " + p.getStockQuantity());

        System.out.println("\nAfter Adding 10 Units:");

        p.addStock(10);
        System.out.println("Updated Stock: " + p.getStockQuantity());

        System.out.println("\nTesting Invalid Values:");

        p.setProductName(" ");
        p.setPrice(-1000);

        p.displayInfo();
    }
}
