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
public class Main {
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
