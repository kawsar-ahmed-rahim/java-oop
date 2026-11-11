// Problem: Employee Salary and Payment System
// Write a Java program using two interfaces: Payable and EmployeeInfo.Requirements
// 1. Create an interface Payable
// - Declare a method calculatePayment().
// 2. Create an interface EmployeeInfo
// - Declare a method displayInfo().
// 3. Create a class Employee
// Implement both Payable and EmployeeInfo.
// Declare the following variables:
// name
// id
// basicSalary
// bonus
// Implement calculatePayment() to calculate and display the total salary.
// Implement displayInfo() to display the employee's name and ID.

// 4. Create a Main class
// Create an object of Employee.

// Call both methods.

interface Payable {
    void calculatePayment();
}

interface EmployeeInfo {
    void displayInfo();
}

class Employee implements Payable, EmployeeInfo {
    String name;
    int id;
    double basicSalary;
    double bonus;

    Employee(String name, int id, double basicSalary, double bonus) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public void calculatePayment() {
        double totalSalary = basicSalary + bonus;
        System.out.println("Total Salary: " + totalSalary);
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", 101, 30000, 5000);

        emp.displayInfo();
        emp.calculatePayment();
    }
}
