/*
 * Exercise 2 — Bank Account (driver class)
 */
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-1001", "Rahim", 5000);
        System.out.println("Holder : " + acc.getAccountHolder());
        System.out.println("Account: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(1500);      // valid
        acc.deposit(-200);      // invalid
        acc.withdraw(2000);     // valid
        acc.withdraw(10000);    // exceeds balance
        System.out.println("Final balance: " + acc.getBalance());
    }
}
