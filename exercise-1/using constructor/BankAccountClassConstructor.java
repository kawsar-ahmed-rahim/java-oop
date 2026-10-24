// 3.Create a BankAccount class with:
// 
// Attributes: accountNumber, balance.
// 
// Methods: deposit(), withdraw(), and displayBalance().
// 
// In main, create two BankAccount objects and transfer money between them.

// use constructor


class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

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

public class BankAccountClassConstructor {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("A101", 5000);
        BankAccount acc2 = new BankAccount("A102", 2000);

        double transferAmount = 1000;

        acc1.withdraw(transferAmount);
        acc2.deposit(transferAmount);

        System.out.println("After transferring " + transferAmount + " from " + acc1.accountNumber + " to " + acc2.accountNumber + ":");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
