// Exercise 14: Account with Constructor Validation
// Create a class Account.
// Variables:
// String accountNumber;
// String holderName;
// double balance;
// The constructor should make sure that the initial balance is not negative.
// Methods:
// void deposit(double amount)
// boolean withdraw(double amount)
// void displayAccount()

class Account {
    String accountNumber;
    String holderName;
    double balance;

    Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc = new Account("AC1001", "Rahim", 1000.0);
        acc.deposit(500);
        acc.withdraw(2000);
        acc.withdraw(700);
        acc.displayAccount();
    }
}