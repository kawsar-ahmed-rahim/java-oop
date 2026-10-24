/*
 * ==================== QUESTION ====================
 * Exercise 5: Bank Account System
 * Create a superclass BankAccount with accountNumber, holderName, and balance. Create two
 *     subclasses:
 * - SavingsAccount with interestRate.
 * - CurrentAccount with serviceCharge.
 * Requirements:
 * 1. All classes must contain parameterized constructors.
 * 2. Both subclasses must call the parent constructor using super().
 * 3. Define calculateYearEndBalance() in BankAccount, returning the balance.
 * 4. Override this method in SavingsAccount to add annual interest.
 * 5. Override it in CurrentAccount to subtract the service charge.
 * 6. Display the final balance for each account.
 * Example: For an initial balance of 10,000, an interest rate of 5%, and a service charge
 *     of 200:
 * Savings Account Final Balance: 10500.0
 * Current Account Final Balance: 9800.0
 * =================================================
 */

// ANSWER
class BankAccount {
    protected String accountNumber;
    protected String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double calculateYearEndBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;   // percentage, e.g. 5 means 5%

    public SavingsAccount(String accountNumber, String holderName,
                          double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateYearEndBalance() {
        double annualInterest = balance * interestRate / 100;
        return balance + annualInterest;
    }
}

class CurrentAccount extends BankAccount {
    private double serviceCharge;

    public CurrentAccount(String accountNumber, String holderName,
                          double balance, double serviceCharge) {
        super(accountNumber, holderName, balance);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateYearEndBalance() {
        return balance - serviceCharge;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA-001", "Rahim", 10000, 5);
        CurrentAccount current = new CurrentAccount("CA-001", "Karim", 10000, 200);

        System.out.println("Savings Account Final Balance: "
                + savings.calculateYearEndBalance());
        System.out.println("Current Account Final Balance: "
                + current.calculateYearEndBalance());
    }
}
