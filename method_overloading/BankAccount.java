// Exercise 3: Bank Account
// Create a class BankAccount with overloaded constructors:
// 1. No-argument constructor → initializes account with default balance = 0.
// 2. Constructor with accountNumber.
// 3. Constructor with accountNumber and balance.
// 4. Constructor with accountNumber, balance, and accountHolderName.

class BankAccount {
    String accountNumber;
    double balance;
    String accountHolderName;

    BankAccount() {
        this.accountNumber = "Unknown";
        this.balance = 0;
        this.accountHolderName = "Unknown";
    }

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountHolderName = "Unknown";
    }

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = "Unknown";
    }

    BankAccount(String accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }

    void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Holder Name: " + accountHolderName);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("AC1001", 5000, "Rahim");
        acc.showDetails();
    }
}
