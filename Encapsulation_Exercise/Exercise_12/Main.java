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
public class Main {
    public static void main(String[] args) {
        Order order = new Order("O-1001", "Rahim", 5000, 10);
        System.out.println(order.getOrderId() + " | " + order.getCustomerName()
                + " | total " + order.getTotalAmount() + " | discount "
                + order.getDiscountPercentage() + "% | status " + order.getStatus());
        System.out.println("Final amount: " + order.calculateFinalAmount());

        System.out.println();
        System.out.println("Challenge - PLACED cannot jump to DELIVERED:");
        order.deliverOrder();                 // rejected
        System.out.println("Status: " + order.getStatus());

        System.out.println();
        System.out.println("Normal flow:");
        order.shipOrder();
        order.cancelOrder();                  // rejected: already shipped
        order.deliverOrder();
        System.out.println("Status: " + order.getStatus());

        System.out.println();
        System.out.println("A delivered order cannot change any more:");
        order.shipOrder();
        order.cancelOrder();
        order.deliverOrder();

        System.out.println();
        System.out.println("Discount validation:");
        order.setDiscountPercentage(60);      // rejected
        order.setDiscountPercentage(-5);      // rejected
        order.setDiscountPercentage(20);
        System.out.println("Final amount with 20% discount: " + order.calculateFinalAmount());

        System.out.println();
        System.out.println("Cancelled order:");
        Order second = new Order("O-1002", "Karim", 1200, 0);
        second.cancelOrder();
        second.shipOrder();                   // rejected
        second.cancelOrder();                 // rejected
        System.out.println("Status: " + second.getStatus());

        // order.status = ...;        // compile error: private
        // order.setStatus("DELIVERED");   // compile error: no such method
    }
}
