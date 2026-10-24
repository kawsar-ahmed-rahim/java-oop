/*
 * ==================== QUESTION ====================
 * Exercise 7: Online Shopping Customer Account
 * Create a class named Customer with private attributes customerId, name, email,
 *     phoneNumber, and walletBalance.
 * Requirements:
 * 1. Initialize attributes using a constructor.
 * 2. Provide getter methods for all attributes except where exposing data is unnecessary.
 * 3. Do not provide a setter for customerId.
 * 4. Validate name so that it is not blank.
 * 5. Validate email so that it contains @ and a . after @.
 * 6. Validate phoneNumber so that it contains exactly 11 digits.
 * 7. Do not provide a public setter for walletBalance.
 * 8. Create addMoney() and makePayment() methods that perform appropriate balance checks.
 * 9. Ensure invalid setter inputs do not modify existing data.
 * Challenge: Prevent external code from directly modifying the wallet balance.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("C-001", "Rahim", "rahim@example.com",
                "01712345678", 1000);
        System.out.println(c.getCustomerId() + " | " + c.getName() + " | " + c.getEmail()
                + " | " + c.getPhoneNumber() + " | wallet: " + c.getWalletBalance());

        System.out.println();
        System.out.println("Invalid setter inputs (data must stay unchanged):");
        c.setName("   ");
        c.setEmail("rahim.example.com");     // no @
        c.setEmail("rahim@examplecom");      // no . after @
        c.setPhoneNumber("0171234");         // too short
        c.setPhoneNumber("0171234567a");     // not all digits
        System.out.println(c.getName() + " | " + c.getEmail() + " | " + c.getPhoneNumber());

        System.out.println();
        System.out.println("Valid setter inputs:");
        c.setName("Rahim Uddin");
        c.setEmail("rahim.uddin@mail.com");
        c.setPhoneNumber("01898765432");
        System.out.println(c.getName() + " | " + c.getEmail() + " | " + c.getPhoneNumber());

        System.out.println();
        System.out.println("Wallet operations:");
        c.addMoney(500);
        c.addMoney(-10);
        c.makePayment(300);
        c.makePayment(5000);
        System.out.println("Final wallet balance: " + c.getWalletBalance());

        // Challenge: outside code cannot modify the wallet directly.
        // c.walletBalance = 1000000;     // compile error: walletBalance is private
        // c.setWalletBalance(1000000);   // compile error: no such method
    }
}
