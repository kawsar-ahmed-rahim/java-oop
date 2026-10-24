// Exercise 5: Employee Salary
// Create a class Employee with overloaded constructors:
// 1. Accepts only name.
// 2. Accepts name and salary.
// 3. Accepts name, salary, and designation.
// Add a method showDetails() to print employee info.

class Employee {
    String name;
    double salary;
    String designation;

    Employee(String name) {
        this.name = name;
        this.salary = 0;
        this.designation = "Unknown";
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.designation = "Unknown";
    }

    Employee(String name, double salary, String designation) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Rahim", 30000, "Developer");
        emp.showDetails();
    }
}
