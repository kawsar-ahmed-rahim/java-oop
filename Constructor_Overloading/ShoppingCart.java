// Exercise 10: Challenge — Shopping System
// Create a class ShoppingCart.
// Variables:
// String customerName;
// double totalAmount;
// int numberOfItems;
// Constructor overloading:
// ShoppingCart()
// ShoppingCart(String customerName)
// ShoppingCart(String customerName, double totalAmount)
// ShoppingCart(String customerName, double totalAmount, int numberOfItems)
// Create overloaded addItem() methods:
// void addItem(double price)
// void addItem(double price, int quantity)
// void addItem(String productName, double price, int quantity)
// Also create:
// void displayCart()

class ShoppingCart {
    String customerName;
    double totalAmount;
    int numberOfItems;

    ShoppingCart() {
        this.customerName = "Guest";
        this.totalAmount = 0;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName) {
        this.customerName = customerName;
        this.totalAmount = 0;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.numberOfItems = 0;
    }

    ShoppingCart(String customerName, double totalAmount, int numberOfItems) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.numberOfItems = numberOfItems;
    }

    void addItem(double price) {
        totalAmount += price;
        numberOfItems += 1;
    }

    void addItem(double price, int quantity) {
        totalAmount += price * quantity;
        numberOfItems += quantity;
    }

    void addItem(String productName, double price, int quantity) {
        totalAmount += price * quantity;
        numberOfItems += quantity;
        System.out.println("Added: " + productName);
    }

    void displayCart() {
        System.out.println("Customer: " + customerName);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Number of Items: " + numberOfItems);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("Rahim");
        cart.addItem(100);
        cart.addItem(50, 2);
        cart.addItem("Notebook", 30, 3);
        cart.displayCart();
    }
}