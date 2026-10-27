/*
 * ==================== QUESTION ====================
 * Exercise 4: Employee Salary Management System
 * Create a superclass Employee containing name, employeeId, and basicSalary. Create a
 *     subclass Manager containing an additional attribute bonus.
 * Requirements:
 * 1. Initialize all employee information using constructors.
 * 2. Use super() inside the Manager constructor.
 * 3. Define calculateSalary() in Employee that returns basicSalary.
 * 4. Override calculateSalary() in Manager so it returns basicSalary + bonus.
 * 5. Override displayDetails() to print all relevant information.
 * 6. Create objects of Employee and Manager and compare their salaries.
 * Sample data:
 * Attribute      Employee   Manager
 * Name           Rahim      Karim
 * ID             101        102
 * Basic salary   30,000     50,000
 * Bonus          -          15,000
 * Expected salary: Employee = 30,000, Manager = 65,000.
 * =================================================
 */


class Employee {
    protected String name;
    protected int employeeId;
    protected double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("Name         : " + name);
        System.out.println("ID           : " + employeeId);
        System.out.printf("Basic Salary : %,.2f%n", basicSalary);
        System.out.printf("Total Salary : %,.2f%n", calculateSalary());
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int employeeId, double basicSalary, double bonus) {
        super(name, employeeId, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name         : " + name);
        System.out.println("ID           : " + employeeId);
        System.out.printf("Basic Salary : %,.2f%n", basicSalary);
        System.out.printf("Bonus        : %,.2f%n", bonus);
        System.out.printf("Total Salary : %,.2f%n", calculateSalary());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahim", 101, 30000);
        Manager manager = new Manager("Karim", 102, 50000, 15000);

        System.out.println("--- Employee ---");
        employee.displayDetails();
        System.out.println();
        System.out.println("--- Manager ---");
        manager.displayDetails();

        System.out.println();
        System.out.println("--- Salary comparison ---");
        System.out.printf("Employee salary: %,.0f%n", employee.calculateSalary());
        System.out.printf("Manager salary : %,.0f%n", manager.calculateSalary());

        double difference = manager.calculateSalary() - employee.calculateSalary();
        if (difference > 0) {
            System.out.printf("The manager earns %,.0f more than the employee.%n", difference);
        } else if (difference < 0) {
            System.out.printf("The employee earns %,.0f more than the manager.%n", -difference);
        } else {
            System.out.println("Both earn the same salary.");
        }
    }
}
