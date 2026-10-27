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

class Employee {
    private final int employeeId;   
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must not be negative");
        }
        this.employeeId = employeeId;
        this.name = name.trim();
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: name cannot be blank.");
        } else {
            this.name = name.trim();
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: salary cannot be negative.");
        } else {
            this.salary = salary;
        }
    }

    public void increaseSalary(double percentage) {
        if (percentage <= 0 || percentage > 100) {
            System.out.println("Error: percentage must be greater than 0 and at most 100.");
            return;
        }
        salary += salary * percentage / 100;
        System.out.println("Salary increased by " + percentage + "%");
    }
}

public class EmployeeSalaryValidation {
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

       
        System.out.println();
        System.out.println("Employee ID is still: " + emp.getEmployeeId());
    }
}
