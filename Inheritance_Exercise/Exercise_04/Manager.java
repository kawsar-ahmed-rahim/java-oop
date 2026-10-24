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
public class Manager extends Employee {
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
