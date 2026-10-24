// Exercise 4: Bank Account
// Create a class BankAccount.
// Variables:
// String accountHolder;
// double balance;
// Create a constructor to initialize them.
// Add methods:
// void deposit(double amount)
// void withdraw(double amount)
// void checkBalance()
// b1.checkBalance();
// Make sure the user cannot withdraw more money than the current balance.

class BankAccount {
   
    String accountHolder;
    double balance;


    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount; 
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; 
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    
    void checkBalance() {
        System.out.println("---------------------------------");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
        
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        
        BankAccount b1 = new BankAccount("Rahim", 3000.00);

        
        b1.checkBalance();


        b1.deposit(500.00);
        b1.checkBalance();

     
        b1.withdraw(1200.00);
        b1.checkBalance();
        
       
        b1.withdraw(5000.00);
    }
}
