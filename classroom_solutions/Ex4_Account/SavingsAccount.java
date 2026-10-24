/*
 * Problem Statement (4)
 * Derived class: SavingsAccount (extends Account)
 *   - Instance variable: interestRate
 *   - Constructor calls Account constructor using super()
 *     and prints "SavingsAccount constructor called"
 *   - displayDetails() shows all account details.
 */
public class SavingsAccount extends Account {

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
