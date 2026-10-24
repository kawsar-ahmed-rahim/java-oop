/*
 * ==================== QUESTION ====================
 * Exercise 3: Employee Salary Validation
 * Create a Java class named Employee with the private attributes employeeId, name, and
 *     salary.
 * Requirements:
 * 1. Initialize attributes using a constructor.
 * 2. Implement getter methods for all attributes.
 * 3. Make employeeId read-only after object creation.
 * 4. Provide setter methods for name and salary.
 * 5. setSalary() must reject negative values.
 * 6. setName() must reject blank names.
 * 7. Create a method increaseSalary(double percentage) that validates the percentage
 *     before updating the salary.
 * Challenge: Do not allow the employee ID to be changed after the object is created.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Rahim", 50000);
        System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getName()
                + ", Salary: " + emp.getSalary());

        System.out.println();
        emp.setSalary(-100);
        emp.setName("   ");
        emp.increaseSalary(-5);
        emp.increaseSalary(150);
        emp.increaseSalary(10);
        emp.setName("Rahim Uddin");
        System.out.println("ID: " + emp.getEmployeeId() + ", Name: " + emp.getName()
                + ", Salary: " + emp.getSalary());

        // Challenge: the employee ID cannot be changed after creation.
        // emp.setEmployeeId(999);    // compile error: no such method
        // emp.employeeId = 999;      // compile error: private and final
        System.out.println();
        System.out.println("Employee ID is still: " + emp.getEmployeeId());
    }
}
