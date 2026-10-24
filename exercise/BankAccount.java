// Exercise 3: BankAccount
// •
// Constructors:
// 1.
// Default constructor → balance = 0.
// 2.
// Constructor with initial balance.
// •
// Method Overloading:
// o
// deposit(int amount)
// o
// deposit(double amount)
// •
// Normal Methods:
// o
// withdraw(double amount)
// o
// showBalance() → print balance.

class BankAccount {
    double balance;

    BankAccount() {
        this.balance = 0;
    }

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        account.deposit(500);
        account.withdraw(200);
        account.showBalance();
    }
}