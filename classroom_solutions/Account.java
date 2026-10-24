/*
 * ===================== QUESTION =====================
 * Problem Statement (4)
 * Create a class hierarchy representing a simple bank account system:
 *
 * Base class: Account
 *   - Instance variables: accountNumber, balance
 *   - Constructor: initialize both variables and print a message
 *     "Account constructor called"
 *
 * Derived class: SavingsAccount (extends Account)
 *   - Instance variable: interestRate
 *   - Constructor: should call the Account constructor using super()
 *   - Print a message "SavingsAccount constructor called"
 *   - Add a method displayDetails() in SavingsAccount to show all
 *     account details.
 *
 * In the main() method:
 *   - Create an object of SavingsAccount with sample data
 *   - Display all details
 * ====================================================
 */

// Base class (public -> file name is Account.java)
public class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account constructor called");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV-2001", 15000.50, 4.5);
        sa.displayDetails();
    }
}

// Derived class (non-public, same file)
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);       // call Account constructor
        this.interestRate = interestRate;
        System.out.println("SavingsAccount constructor called");
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance       : " + balance);
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}
