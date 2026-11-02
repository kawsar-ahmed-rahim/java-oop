/*
 * ==================== QUESTION ====================
 * Exercise 9: ATM PIN and Account Security
 * Create a class named ATMAccount containing private attributes accountNumber, pin,
 *     balance, and failedAttempts.
 * Requirements:
 * 1. Initialize the account using a constructor.
 * 2. Do not provide a getter for pin.
 * 3. Do not provide a setter for balance.
 * 4. Do not provide a setter for failedAttempts.
 * 5. Create verifyPin(String enteredPin) to verify the PIN.
 * 6. A valid PIN must contain exactly four numeric digits.
 * 7. Create changePin(String oldPin, String newPin) to change the PIN after verifying the
 *     old PIN.
 * 8. After three consecutive failed attempts, block further PIN verification until the
 *     account is unlocked through a separately defined administrative method.
 * 9. Create withdraw() and deposit() methods with appropriate validation.
 * Challenge: Explain why giving a public getPin() method would violate secure
 *     encapsulation principles.
 * =================================================
 */

class ATMAccount {

    private String accountNumber;
    private String pin;
    private double balance;
    private int failedAttempts;
    private boolean isBlocked;

    ATMAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;

        if (pin != null && pin.matches("[0-9]{4}")) {
            this.pin = pin;
        } else {
            this.pin = "0000";
            System.out.println("Error: Invalid PIN! Default PIN set.");
        }

        this.balance = balance;
        this.failedAttempts = 0;
        this.isBlocked = false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPin(String enteredPin) {

        if (isBlocked) {
            System.out.println("Account is blocked!");
            return false;
        }

        if (pin.equals(enteredPin)) {
            failedAttempts = 0;
            System.out.println("PIN verified successfully!");
            return true;
        } else {
            failedAttempts++;

            System.out.println("Incorrect PIN!");

            if (failedAttempts >= 3) {
                isBlocked = true;
                System.out.println("Account blocked after 3 failed attempts!");
            }

            return false;
        }
    }

    public void changePin(String oldPin, String newPin) {

        if (verifyPin(oldPin)) {

            if (newPin != null && newPin.matches("[0-9]{4}")) {
                pin = newPin;
                System.out.println("PIN changed successfully!");
            } else {
                System.out.println("Error: New PIN must contain exactly 4 digits!");
            }

        }
    }

    public void deposit(String enteredPin, double amount) {

        if (verifyPin(enteredPin)) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful!");
            } else {
                System.out.println("Error: Amount must be positive!");
            }
        }
    }

    public void withdraw(String enteredPin, double amount) {

        if (verifyPin(enteredPin)) {

            if (amount <= 0) {
                System.out.println("Error: Amount must be positive!");
            } else if (amount > balance) {
                System.out.println("Error: Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful!");
            }
        }
    }

    public void unlockAccount() {
        isBlocked = false;
        failedAttempts = 0;
        System.out.println("Account unlocked by administrator!");
    }

    public void displayInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Failed Attempts: " + failedAttempts);
        System.out.println("Blocked: " + isBlocked);
    }

    public static void main(String[] args) {

        ATMAccount account = new ATMAccount("123456789", "1234", 10000);

        System.out.println("Initial Account Information:");
        account.displayInfo();

        System.out.println("\nTesting PIN Verification:");

        account.verifyPin("1234");

        System.out.println("\nAfter Deposit:");

        account.deposit("1234", 2000);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println("\nAfter Withdrawal:");

        account.withdraw("1234", 3000);
        System.out.println("Updated Balance: " + account.getBalance());

        System.out.println("\nTesting PIN Change:");

        account.changePin("1234", "5678");

        System.out.println("\nTesting Failed Attempts:");

        account.verifyPin("1111");
        account.verifyPin("2222");
        account.verifyPin("3333");

        System.out.println("\nTrying to Verify After Blocking:");

        account.verifyPin("5678");

        System.out.println("\nAdmin Unlocking Account:");

        account.unlockAccount();

        System.out.println("\nVerifying New PIN:");

        account.verifyPin("5678");

        account.displayInfo();
    }
}
