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
public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA-001", "Rahim", 10000, 5);
        CurrentAccount current = new CurrentAccount("CA-001", "Karim", 10000, 200);

        System.out.println("Savings Account Final Balance: "
                + savings.calculateYearEndBalance());
        System.out.println("Current Account Final Balance: "
                + current.calculateYearEndBalance());
    }
}
