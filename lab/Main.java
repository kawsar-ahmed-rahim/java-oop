// Java Interface Exercise: Payable System

// Beginner–IntermediateProblem: Employee and Invoice Payment System

// A company needs to calculate payments for different types of employees and invoices. You must use a Java interface called Payable to handle payments.1. Create a Payable Interface

// The interface should contain one method:
// public interface Payable { double getPaymentAmount(); }2. Create Three Classes

// Class 1: SalariedEmployee

// Attributes: name, monthlySalary
// Constructor to initialize attributes
// Implement getPaymentAmount() to return monthly salary

// Class 2: HourlyEmployee
// Attributes: name, hoursWorked, hourlyRate
// Constructor to initialize attributes
// Implement getPaymentAmount() to return hoursWorked * hourlyRate

// Class 3: Invoice
// Attributes: productName, quantity, pricePerItem
// Constructor to initialize attributes
// Implement getPaymentAmount() to return quantity * pricePerItem

interface Payable {
    double getPaymentAmount();
}

class SalariedEmployee implements Payable {

    String name;
    double monthlySalary;

    SalariedEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double getPaymentAmount() {
        return monthlySalary;
    }
}

class HourlyEmployee implements Payable {

    String name;
    double hoursWorked;
    double hourlyRate;

    HourlyEmployee(String name, double hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getPaymentAmount() {
        return hoursWorked * hourlyRate;
    }
}

class Invoice implements Payable {

    String productName;
    int quantity;
    double pricePerItem;

    Invoice(String productName, int quantity, double pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

public class Main {

    public static void main(String[] args) {

        SalariedEmployee s = new SalariedEmployee("Rahim", 3000);

        HourlyEmployee h = new HourlyEmployee("bijoy", 4, 20);

        Invoice i = new Invoice("Laptop", 6, 5000);

        System.out.println("Salaried Employee Payment: " + s.getPaymentAmount());

        System.out.println("Hourly Employee Payment: " + h.getPaymentAmount());

        System.out.println("Invoice Payment: " + i.getPaymentAmount());
    }
}