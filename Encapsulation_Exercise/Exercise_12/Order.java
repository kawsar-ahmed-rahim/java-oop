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

// ANSWER
public class Order {
    // Only these four statuses can ever exist
    private enum Status { PLACED, SHIPPED, DELIVERED, CANCELLED }

    private final String orderId;      // read-only
    private String customerName;
    private final double totalAmount;
    private Status status;             // changed only by ship/deliver/cancel
    private double discountPercentage;

    // A new order always starts as PLACED
    public Order(String orderId, String customerName, double totalAmount,
                 double discountPercentage) {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException("Order ID must not be empty");
        }
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name must not be empty");
        }
        if (totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than zero");
        }
        if (!(discountPercentage >= 0 && discountPercentage <= 50)) {
            throw new IllegalArgumentException("Discount must be between 0% and 50%");
        }
        this.orderId = orderId;
        this.customerName = customerName.trim();
        this.totalAmount = totalAmount;
        this.discountPercentage = discountPercentage;
        this.status = Status.PLACED;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status.name();
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            System.out.println("Error: customer name cannot be empty.");
        } else {
            this.customerName = customerName.trim();
        }
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage >= 0 && discountPercentage <= 50) {
            this.discountPercentage = discountPercentage;
        } else {
            System.out.println("Error: discount must be between 0% and 50%. Previous value kept.");
        }
    }

    // PLACED -> SHIPPED only
    public void shipOrder() {
        if (status == Status.PLACED) {
            status = Status.SHIPPED;
            System.out.println("Order " + orderId + " shipped.");
        } else {
            System.out.println("Cannot ship order " + orderId + ": it is " + status + ".");
        }
    }

    // SHIPPED -> DELIVERED only (so PLACED can never jump straight to DELIVERED)
    public void deliverOrder() {
        if (status == Status.SHIPPED) {
            status = Status.DELIVERED;
            System.out.println("Order " + orderId + " delivered.");
        } else {
            System.out.println("Cannot deliver order " + orderId + ": it is " + status + ".");
        }
    }

    // PLACED -> CANCELLED only (a shipped order cannot be cancelled)
    public void cancelOrder() {
        if (status == Status.PLACED) {
            status = Status.CANCELLED;
            System.out.println("Order " + orderId + " cancelled.");
        } else {
            System.out.println("Cannot cancel order " + orderId + ": it is " + status + ".");
        }
    }

    public double calculateFinalAmount() {
        return totalAmount - (totalAmount * discountPercentage / 100);
    }
}
