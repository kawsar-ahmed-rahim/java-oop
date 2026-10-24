// Exercise 16: Challenge — ATM Account
// Create a class ATMAccount.
// Variables:
// String name;
// int pin;
// double balance;
// Create a constructor.
// Methods:
// boolean verifyPin(int enteredPin)
// void deposit(double amount)
// void withdraw(double amount, int enteredPin)
// void checkBalance(int enteredPin)
// The withdrawal and balance-check methods should only work when the PIN is correct.

class ATMAccount {
    String name;
    int pin;
    double balance;

    ATMAccount(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }

    boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount, int enteredPin) {
        if (verifyPin(enteredPin)) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    void checkBalance(int enteredPin) {
        if (verifyPin(enteredPin)) {
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public static void main(String[] args) {
        ATMAccount account = new ATMAccount("Rahim", 1234, 5000.0);
        account.deposit(1000);
        account.withdraw(2000, 1234);
        account.checkBalance(1234);
        account.withdraw(1000, 1111);
    }
}