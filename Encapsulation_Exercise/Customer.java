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


class Customer {

    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private double walletBalance;

    Customer(int customerId, String name, String email, String phoneNumber, double walletBalance) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.walletBalance = walletBalance;
    }

    public int getCustomerId() {
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

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid name!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") &&
            email.indexOf(".") > email.indexOf("@")) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email!");
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("[0-9]{11}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Error: Phone number must contain exactly 11 digits!");
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            walletBalance += amount;
            System.out.println("Money added successfully!");
        } else {
            System.out.println("Error: Amount must be positive!");
        }
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be positive!");
        } else if (amount > walletBalance) {
            System.out.println("Error: Insufficient wallet balance!");
        } else {
            walletBalance -= amount;
            System.out.println("Payment successful!");
        }
    }

    public void displayInfo() {
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Wallet Balance: " + getWalletBalance());
    }

    public static void main(String[] args) {

        Customer c = new Customer(101, "Rahim", "rahim@gmail.com", "01712345678", 5000);

        System.out.println("Initial Customer Information:");
        c.displayInfo();

        System.out.println("\nAfter Updating Information:");

        c.setName("Karim");
        c.setEmail("karim@gmail.com");
        c.setPhoneNumber("01812345678");
        c.displayInfo();

        System.out.println("\nAfter Adding Money:");

        c.addMoney(2000);
        System.out.println("Updated Balance: " + c.getWalletBalance());

        System.out.println("\nAfter Making Payment:");

        c.makePayment(1500);
        System.out.println("Updated Balance: " + c.getWalletBalance());

        System.out.println("\nTesting Invalid Values:");

        c.setName(" ");
        c.setEmail("invalidemail");
        c.setPhoneNumber("12345");
        c.makePayment(10000);

        c.displayInfo();
    }
}
