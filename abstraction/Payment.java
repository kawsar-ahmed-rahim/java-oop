// Exercise 6: Payment System
// Create an abstract class Payment with an abstract method:
// abstract void pay(double amount);
// Create subclasses CreditCardPayment, BkashPayment, and CashPayment.
// In the main method, store all three objects in a Payment[] array and call pay() using a loop.

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class BkashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Bkash.");
    }
}

class CashPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }

    public static void main(String[] args) {

        Payment[] payments = {
                new CreditCardPayment(),
                new BkashPayment(),
                new CashPayment()
        };

        for (int i = 0; i < payments.length; i++) {
            payments[i].pay(1000);
        }
    }
}
