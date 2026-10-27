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
    private static final int MAX_FAILED_ATTEMPTS = 3;

    private final String accountNumber;
    private String pin;                  
    private double balance;             
    private int failedAttempts;          
    private boolean locked;

    
    public ATMAccount(String accountNumber, String pin, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number must not be empty");
        }
        if (!isValidPin(pin)) {
            throw new IllegalArgumentException("PIN must be exactly four numeric digits");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Opening balance must not be negative");
        }
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.failedAttempts = 0;
        this.locked = false;
    }

    private static boolean isValidPin(String pin) {
        return pin != null && pin.matches("\\d{4}");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean verifyPin(String enteredPin) {
        if (locked) {
            System.out.println("Account is locked. Contact the bank administrator.");
            return false;
        }
        if (pin.equals(enteredPin)) {
            failedAttempts = 0;          // a success resets the consecutive failures
            return true;
        }
        failedAttempts++;
        System.out.println("Incorrect PIN (attempt " + failedAttempts + " of "
                + MAX_FAILED_ATTEMPTS + ").");
        if (failedAttempts >= MAX_FAILED_ATTEMPTS) {
            locked = true;
            System.out.println("Too many failed attempts: the account is now locked.");
        }
        return false;
    }

    public boolean changePin(String oldPin, String newPin) {
        if (!verifyPin(oldPin)) {
            System.out.println("PIN not changed.");
            return false;
        }
        if (!isValidPin(newPin)) {
            System.out.println("Error: new PIN must be exactly four numeric digits.");
            return false;
        }
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
        return true;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount + ". Balance: " + balance);
        }
    }

    // withdrawing requires the PIN
    public void withdraw(String enteredPin, double amount) {
        if (!verifyPin(enteredPin)) {
            System.out.println("Withdrawal denied.");
        } else if (amount <= 0) {
            System.out.println("Error: withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: insufficient balance (" + balance + ").");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Balance: " + balance);
        }
    }

    // Administrative method: unlocks the account and clears the failed attempts.
    // In a real system this would be available only to authorized bank staff.
    public void unlockAccount() {
        locked = false;
        failedAttempts = 0;
        System.out.println("Administrator unlocked account " + accountNumber + ".");
    }
}

public class ATMSecurity {
    public static void main(String[] args) {
        ATMAccount account = new ATMAccount("ACC-1001", "1234", 5000);

        System.out.println("Three wrong PINs in a row:");
        account.verifyPin("0000");
        account.verifyPin("1111");
        account.verifyPin("2222");

        System.out.println();
        System.out.println("Correct PIN while locked:");
        account.verifyPin("1234");

        System.out.println();
        account.unlockAccount();
        System.out.println("Correct PIN after unlock: " + account.verifyPin("1234"));

        System.out.println();
        account.withdraw("1234", 1000);
        account.withdraw("1234", 99999);
        account.withdraw("1234", -5);
        account.deposit(750);
        account.deposit(0);

        System.out.println();
        account.changePin("1234", "12ab");     // invalid new PIN
        account.changePin("1234", "4321");     // valid
        System.out.println("Old PIN still works? " + account.verifyPin("1234"));
        System.out.println("New PIN works?       " + account.verifyPin("4321"));
        System.out.println("Final balance: " + account.getBalance());

        System.out.println();
        System.out.println("Why a public getPin() would break encapsulation:");
        System.out.println("1. It hands the secret to ANY code that holds the object, so a");
        System.out.println("   bug, a log statement or malicious code could read and leak it.");
        System.out.println("2. It makes verifyPin() pointless: the class can no longer");
        System.out.println("   control how the PIN is checked, or count wrong attempts.");
        System.out.println("3. Callers could copy the PIN and keep using it after the owner");
        System.out.println("   changes it. Keeping pin private (and only comparing it inside");
        System.out.println("   the class) means the secret never leaves the object.");
    }
}
