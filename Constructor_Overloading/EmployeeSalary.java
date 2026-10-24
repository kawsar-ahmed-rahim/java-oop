// Exercise 1: Employee Salary
// Create a class Employee.
// Variables:
// String name;
// double salary;
// double bonus;
// Constructor overloading:
// Employee(String name)
// Employee(String name, double salary)
// Employee(String name, double salary, double bonus)
// Method overloading:
// double calculateSalary()
// double calculateSalary(double overtime)
// double calculateSalary(double overtime, double allowance)
// Rules:
// calculateSalary()= salary + bonus
// calculateSalary(overtime)= salary + bonus + overtime
// calculateSalary(overtime, allowance)= salary + bonus + overtime + allowance

class Employee {
    String name;
    double salary;
    double bonus;

    Employee(String name) {
        this.name = name;
        this.salary = 0;
        this.bonus = 0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0;
    }

    Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return salary + bonus;
    }

    double calculateSalary(double overtime) {
        return salary + bonus + overtime;
    }

    double calculateSalary(double overtime, double allowance) {
        return salary + bonus + overtime + allowance;
    }}
    public class EmployeeSalary{

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahim");
        Employee e2 = new Employee("Karim", 30000);
        Employee e3 = new Employee("Hasan", 40000, 5000);

       System.out.println("========== Employee 1 ==========");
        System.out.println("Constructor: Employee(String name)");
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Bonus: " + e1.bonus);

        System.out.println("\ncalculateSalary(): " + e1.calculateSalary());


        System.out.println("\n========== Employee 2 ==========");
        System.out.println("Constructor: Employee(String name, double salary)");
        System.out.println("Name: " + e2.name);
        System.out.println("Salary: " + e2.salary);
        System.out.println("Bonus: " + e2.bonus);

        System.out.println("\ncalculateSalary(): " + e2.calculateSalary());
        System.out.println("calculateSalary(2000): " + e2.calculateSalary(2000));


        System.out.println("\n========== Employee 3 ==========");
        System.out.println("Constructor: Employee(String name, double salary, double bonus)");
        System.out.println("Name: " + e3.name);
        System.out.println("Salary: " + e3.salary);
        System.out.println("Bonus: " + e3.bonus);

        System.out.println("\ncalculateSalary(): " + e3.calculateSalary());
        System.out.println("calculateSalary(3000): " + e3.calculateSalary(3000));
        System.out.println("calculateSalary(3000, 2000): " + e3.calculateSalary(3000, 2000));
}}