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

// ANSWER
public class Employee {
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
