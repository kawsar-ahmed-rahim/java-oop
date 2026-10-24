// Exercise 3: Employee Salary
// Create a class Employee.
// Variables:
// String name;
// double basicSalary;
// double bonus;
// Create a constructor to initialize the variables.
// Methods:
// double calculateTotalSalary()
// void displaySalary()
// Formula:
// Total Salary = Basic Salary + Bonus

public class Employee {
    String name;
    double basicSalary;
    double bonus;

    public Employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    double calculateTotalSalary() {
        return basicSalary + bonus;
    }

    void displaySalary() {
        System.out.println("Employee Salary Details:");
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", 50000.0, 4500.0);
        
        emp.displaySalary();
    }
}
