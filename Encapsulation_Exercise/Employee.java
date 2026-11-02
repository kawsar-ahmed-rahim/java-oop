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

    private int employeeId;
    private String name;
    private double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
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
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid name!");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative!");
        }
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            double increase = salary * percentage / 100;
            salary += increase;
            System.out.println("Salary increased successfully!");
        } else {
            System.out.println("Error: Percentage must be positive!");
        }
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Rahim", 30000);

        System.out.println("Initial Employee Information:");
        emp.displayInfo();

        System.out.println("\nAfter Updating Information:");

        emp.setName("Karim");
        emp.setSalary(35000);
        emp.displayInfo();

        System.out.println("\nAfter Salary Increase:");

        emp.increaseSalary(10);
        System.out.println("Updated Salary: " + emp.getSalary());

        System.out.println("\nTesting Invalid Values:");

        emp.setName(" ");
        emp.setSalary(-5000);
        emp.increaseSalary(-10);

        emp.displayInfo();
    }
}
