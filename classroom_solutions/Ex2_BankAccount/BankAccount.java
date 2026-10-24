/*
 * ===================== QUESTION =====================
 * Exercise 2 — Bank Account
 * Create a class BankAccount with private fields accountNumber,
 * accountHolder, and balance.
 *
 * Requirements:
 *  - The balance cannot be changed directly.
 *  - Implement deposit(double amount).
 *  - Implement withdraw(double amount).
 *  - Deposits must be positive.
 *  - Withdrawal cannot exceed the current balance.
 *  - Provide a getter for the balance but (no setter).
 * ====================================================
 */
public class BankAccount {

    // Private data members
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    // Deposit: amount must be positive
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    // Withdraw: amount must be positive and cannot exceed balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Current balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    // Getters (NO setter for balance)
    public double getBalance() { return balance; }
    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
}
