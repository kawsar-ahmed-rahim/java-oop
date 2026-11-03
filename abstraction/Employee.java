// Exercise 4: Employee Salary
// Create an abstract class Employee containing:
// •
// name and id fields.
// •
// A constructor.
// •
// An abstract method calculateSalary().
// •
// A concrete method displayDetails().
// Create subclasses:
// •
// FullTimeEmployee – fixed monthly salary.
// •
// PartTimeEmployee – hours worked × hourly rate.
// Calculate and display salaries using polymorphism.


abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Rahim", 101, 30000);
        Employee e2 = new PartTimeEmployee("Karim", 102, 80, 200);

        System.out.println("Full Time Employee Details:");
        e1.displayDetails();

        System.out.println();

        System.out.println("Part Time Employee Details:");
        e2.displayDetails();
    }
}
