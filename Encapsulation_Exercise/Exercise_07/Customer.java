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
public class Customer {
    private final String customerId;   // no setter
    private String name;
    private String email;
    private String phoneNumber;
    private double walletBalance;      // no setter, changed only by addMoney/makePayment

    public Customer(String customerId, String name, String email,
                    String phoneNumber, double walletBalance) {
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer ID must not be empty");
        }
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if (!isValidPhone(phoneNumber)) {
            throw new IllegalArgumentException("Phone number must contain exactly 11 digits");
        }
        if (walletBalance < 0) {
            throw new IllegalArgumentException("Wallet balance must not be negative");
        }
        this.customerId = customerId;
        this.name = name.trim();
        this.email = email.trim();
        this.phoneNumber = phoneNumber;
        this.walletBalance = walletBalance;
    }

    private static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    // must contain exactly one @ and a '.' somewhere after it (not the last character)
    private static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        String e = email.trim();
        int at = e.indexOf('@');
        int dot = e.lastIndexOf('.');
        return at > 0 && at == e.lastIndexOf('@') && dot > at + 1 && dot < e.length() - 1;
    }

    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{11}");
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Returns a copy of a primitive value, so callers can read but never modify it.
    public double getWalletBalance() {
        return walletBalance;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name.trim();
        } else {
            System.out.println("Error: name cannot be blank. Previous value kept.");
        }
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email.trim();
        } else {
            System.out.println("Error: invalid email '" + email + "'. Previous value kept.");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isValidPhone(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Error: phone number must have exactly 11 digits. "
                    + "Previous value kept.");
        }
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Error: amount to add must be positive.");
        } else {
            walletBalance += amount;
            System.out.println("Added " + amount + ". Wallet balance: " + walletBalance);
        }
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Error: payment amount must be positive.");
        } else if (amount > walletBalance) {
            System.out.println("Payment failed: insufficient wallet balance ("
                    + walletBalance + ").");
        } else {
            walletBalance -= amount;
            System.out.println("Paid " + amount + ". Wallet balance: " + walletBalance);
        }
    }
}
