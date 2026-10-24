// Exercise 3: Bank Account
// Create a class BankAccount.
// Variables:
// String accountName;
// String accountNumber;
// double balance;
// Constructor overloading:
// BankAccount(String accountName)
// BankAccount(String accountName, String accountNumber)
// BankAccount(String accountName, String accountNumber, double balance)
// Create overloaded deposit() methods:
// void deposit(double amount)
// void deposit(double amount, String description)
// void deposit(double amount, String description, int transactionId)

class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountNumber = "Not Assigned";
        this.balance = 0;
    }

    BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    BankAccount(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
        System.out.println("New Balance: " + balance);
    }

    void deposit(double amount, String description) {
        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
        System.out.println("Description: " + description);
        System.out.println("New Balance: " + balance);
    }

    void deposit(double amount, String description, int transactionId) {
        balance = balance + amount;

        System.out.println("Deposited Amount: " + amount);
        System.out.println("Description: " + description);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("New Balance: " + balance);
    }}
    public class EmployeeSalary{

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Rahim");

        BankAccount a2 = new BankAccount("Karim", "AC1002");

        BankAccount a3 = new BankAccount("Hasan", "AC1003", 10000);


        System.out.println("========== Account 1 ==========");
        System.out.println("Constructor: BankAccount(String accountName)");
        System.out.println("Account Name: " + a1.accountName);
        System.out.println("Account Number: " + a1.accountNumber);
        System.out.println("Balance: " + a1.balance);

        System.out.println("\n--- deposit(double amount) ---");
        a1.deposit(2000);


        System.out.println("\n========== Account 2 ==========");
        System.out.println("Constructor: BankAccount(String accountName, String accountNumber)");
        System.out.println("Account Name: " + a2.accountName);
        System.out.println("Account Number: " + a2.accountNumber);
        System.out.println("Balance: " + a2.balance);

        System.out.println("\n--- deposit(double amount) ---");
        a2.deposit(3000);

        System.out.println("\n--- deposit(double amount, String description) ---");
        a2.deposit(2000, "Salary");


        System.out.println("\n========== Account 3 ==========");
        System.out.println("Constructor: BankAccount(String accountName, String accountNumber, double balance)");
        System.out.println("Account Name: " + a3.accountName);
        System.out.println("Account Number: " + a3.accountNumber);
        System.out.println("Balance: " + a3.balance);

        System.out.println("\n--- deposit(double amount) ---");
        a3.deposit(1000);

        System.out.println("\n--- deposit(double amount, String description) ---");
        a3.deposit(2000, "Bonus");

        System.out.println("\n--- deposit(double amount, String description, int transactionId) ---");
        a3.deposit(5000, "Project Payment", 101);
    }
}