/*
 * ==================== QUESTION ====================
 * Exercise 12: E-Commerce Order Management
 * Create a class named Order containing private attributes orderId, customerName,
 *     totalAmount, status, and discountPercentage.
 * Requirements:
 * 1. Initialize the attributes using a constructor.
 * 2. Make orderId read-only.
 * 3. Provide getter methods for all attributes.
 * 4. Provide validated setters for customerName and discountPercentage.
 * 5. Accept discounts only between 0% and 50%.
 * 6. Do not provide a direct setter for status.
 * 7. Allow only the following statuses: PLACED, SHIPPED, DELIVERED, CANCELLED.
 * 8. Create shipOrder(), deliverOrder(), and cancelOrder() methods.
 * 9. An order can be shipped only after being placed.
 * 10. A shipped order can be delivered but cannot be cancelled.
 * 11. A delivered or cancelled order cannot undergo any further status changes.
 * 12. Create calculateFinalAmount() that returns the amount after applying the discount.
 * Challenge: Ensure the order status cannot be changed directly from PLACED to DELIVERED.
 *
 * =================================================
 */

class Order {

    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private double discountPercentage;

    Order(int orderId, String customerName, double totalAmount,
            String status, double discountPercentage) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = Math.max(0, totalAmount);

        if (status != null &&
                (status.equals("PLACED") || status.equals("SHIPPED") ||
                        status.equals("DELIVERED") || status.equals("CANCELLED"))) {
            this.status = status;
        } else {
            this.status = "PLACED";
        }

        if (discountPercentage >= 0 && discountPercentage <= 50) {
            this.discountPercentage = discountPercentage;
        } else {
            this.discountPercentage = 0;
            System.out.println("Error: Invalid discount percentage!");
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setCustomerName(String customerName) {
        if (customerName != null && !customerName.trim().isEmpty()) {
            this.customerName = customerName;
        } else {
            System.out.println("Error: Invalid customer name!");
        }
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 50) {
            this.discountPercentage = discountPercentage;
        } else {
            System.out.println("Error: Discount must be between 0 and 50!");
        }
    }

    public void shipOrder() {
        if (status.equals("PLACED")) {
            status = "SHIPPED";
            System.out.println("Order shipped successfully!");
        } else {
            System.out.println("Error: Order cannot be shipped!");
        }
    }

    public void deliverOrder() {
        if (status.equals("SHIPPED")) {
            status = "DELIVERED";
            System.out.println("Order delivered successfully!");
        } else {
            System.out.println("Error: Order must be shipped first!");
        }
    }

    public void cancelOrder() {
        if (status.equals("PLACED")) {
            status = "CANCELLED";
            System.out.println("Order cancelled successfully!");
        } else {
            System.out.println("Error: This order cannot be cancelled!");
        }
    }

    public double calculateFinalAmount() {
        double discount = totalAmount * discountPercentage / 100;
        return totalAmount - discount;
    }

    public void displayInfo() {
        System.out.println("Order ID: " + getOrderId());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Total Amount: " + getTotalAmount());
        System.out.println("Discount: " + getDiscountPercentage() + "%");
        System.out.println("Final Amount: " + calculateFinalAmount());
        System.out.println("Status: " + getStatus());
    }

    public static void main(String[] args) {

        Order order = new Order(101, "Rahim", 10000, "PLACED", 10);

        System.out.println("Initial Order Information:");
        order.displayInfo();

        System.out.println("\nAfter Updating Information:");

        order.setCustomerName("Karim");
        order.setDiscountPercentage(20);
        order.displayInfo();

        System.out.println("\nAfter Shipping Order:");

        order.shipOrder();
        order.displayInfo();

        System.out.println("\nTrying to Cancel Shipped Order:");

        order.cancelOrder();

        System.out.println("\nAfter Delivering Order:");

        order.deliverOrder();
        order.displayInfo();

        System.out.println("\nTrying to Change Delivered Order:");

        order.shipOrder();
        order.cancelOrder();
    }
}
