// 3.Create a BankAccount class with:
// 
// Attributes: accountNumber, balance.
// 
// Methods: deposit(), withdraw(), and displayBalance().
// 
// In main, create two BankAccount objects and transfer money between them.

class BankAccount {
    int accountNumber;
    double balance;


    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        acc1.accountNumber = 12;
        acc1.balance = 483;
        acc2.accountNumber = 19;
        acc2.balance = 8345;

        double transferAmount = 1000;

        acc1.withdraw(transferAmount);
        acc2.deposit(transferAmount);

        System.out.println("After transferring " + transferAmount + " from " + acc1.accountNumber + " to " + acc2.accountNumber + ":");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
