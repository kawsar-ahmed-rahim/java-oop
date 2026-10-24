// 10.Create a BankAccount class with fields: accountHolder, balance, and transactionHistory (as an array of Strings).

// Add methods:

// deposit(double amount) → updates balance and stores "Deposited X" in history.

// withdraw(double amount) → updates balance if enough funds, else print error.

// showHistory() → prints all transaction history.

// use constructor
class BankAccount {
    String accountHolder;
    double balance;
    String[] transactionHistory = new String[100];
    int transactionCount = 0;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        transactionHistory[transactionCount++] = "Deposited " + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory[transactionCount++] = "Withdrew " + amount;
        } else {
            System.out.println("Error: Insufficient funds for withdrawal of " + amount);
        }
    }

    void showHistory() {
        System.out.println("Transaction history for " + accountHolder + ":");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(" - " + transactionHistory[i]);
        }
        System.out.println("Current balance: " + balance);
    }
}

public class BankTransactionConstructor {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahim", 10000);

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(50000); 
        account.deposit(500);

        account.showHistory();
    }
}
