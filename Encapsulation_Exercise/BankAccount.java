/*
 * ==================== QUESTION ====================
 * Exercise 2: Bank Account Balance Protection
 * Create a Java class named BankAccount with private attributes accountNumber,
 *     accountHolder, and balance.
 * Requirements:
 * 1. Initialize all attributes using a constructor.
 * 2. Provide getter methods for all attributes.
 * 3. Provide a setter for accountHolder with validation to reject empty names.
 * 4. Do not provide a public setter for accountNumber or balance.
 * 5. Create a deposit(double amount) method that accepts only positive amounts.
 * 6. Create a withdraw(double amount) method that checks whether the amount is positive
 *     and the balance is sufficient.
 * 7. Display the updated balance using getBalance().
 * =================================================
 */

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Invalid account holder name!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456", "Rahim", 5000);

        System.out.println("Initial Account Information:");
        account.displayInfo();

        System.out.println("\nAfter Deposit:");
        account.deposit(2000);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println("\nAfter Withdrawal:");
        account.withdraw(1500);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println("\nTesting Invalid Withdrawal:");
        account.withdraw(10000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
