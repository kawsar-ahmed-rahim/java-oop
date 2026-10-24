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

// ANSWER
class BankAccount {
    private final String accountNumber;   // read-only
    private String accountHolder;
    private double balance;               // changed only by deposit() / withdraw()

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number must not be empty");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder must not be empty");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Opening balance must not be negative");
        }
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder.trim();
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

    // No setAccountNumber() and no setBalance() on purpose.

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            System.out.println("Error: account holder name cannot be empty.");
        } else {
            this.accountHolder = accountHolder.trim();
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount);
        }
    }
}

public class BankAccountProtection {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-1001", "Rahim", 5000);
        System.out.println("Account " + account.getAccountNumber() + " of "
                + account.getAccountHolder() + ", balance: " + account.getBalance());

        System.out.println();
        account.deposit(1500);
        account.deposit(-200);
        account.withdraw(2000);
        account.withdraw(-50);
        account.withdraw(10000);
        System.out.println("Updated balance: " + account.getBalance());

        System.out.println();
        account.setAccountHolder("   ");
        account.setAccountHolder("Rahim Uddin");
        System.out.println("Account holder: " + account.getAccountHolder());

        // account.balance = 1000000;        // compile error: balance is private
        // account.setBalance(1000000);      // compile error: no such method
    }
}
