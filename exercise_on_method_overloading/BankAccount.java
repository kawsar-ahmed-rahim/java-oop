// Exercise 8: Simple Bank Deposit
// Create a class BankAccount with overloaded deposit() methods:
// deposit(double amount);
// deposit(double amount, String description);
// deposit(double amount, String description, int transactionId);
// Print appropriate transaction information from each method.

class BankAccount {
    void deposit(double amount) {
        System.out.println("Deposited: " + amount);
    }

    void deposit(double amount, String description) {
        System.out.println("Deposited: " + amount + ", Description: " + description);
    }

    void deposit(double amount, String description, int transactionId) {
        System.out.println("Deposited: " + amount + ", Description: " + description + ", Transaction ID: " + transactionId);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.deposit(2000, "Salary");
        account.deposit(3000, "Bonus", 101);
    }
}
