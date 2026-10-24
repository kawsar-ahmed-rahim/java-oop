// Exercise 8: Customer Bill
// Create a class Customer.
// Variables:
// String name;
// int customerId;
// double purchaseAmount;
// Constructor overloading:
// Customer(String name)
// Customer(String name, int customerId)
// Customer(String name, int customerId, double purchaseAmount)
// Create overloaded calculateBill() methods:
// double calculateBill()
// double calculateBill(double discount)
// double calculateBill(double discount, double tax)

class Customer {
    String name;
    int customerId;
    double purchaseAmount;

    Customer(String name) {
        this.name = name;
        this.customerId = 0;
        this.purchaseAmount = 0;
    }

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.purchaseAmount = 0;
    }

    Customer(String name, int customerId, double purchaseAmount) {
        this.name = name;
        this.customerId = customerId;
        this.purchaseAmount = purchaseAmount;
    }

    double calculateBill() {
        return purchaseAmount;
    }

    double calculateBill(double discount) {
        return purchaseAmount - discount;
    }

    double calculateBill(double discount, double tax) {
        double bill = purchaseAmount - discount;
        bill = bill + tax;
        return bill;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Rahim", 101, 5000.0);
        System.out.println("Bill: " + customer.calculateBill());
        System.out.println("Bill with discount: " + customer.calculateBill(500));
        System.out.println("Bill with discount and tax: " + customer.calculateBill(500, 200));
    }
}