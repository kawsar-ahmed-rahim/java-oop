// Exercise 5: Calculate Salary
// Create a class Employee and overload a method named calculateSalary().
// Use:
// calculateSalary(double basicSalary);
// calculateSalary(double basicSalary, double bonus);
// calculateSalary(double basicSalary, double bonus, double overtime);
// The methods should return the employee's total salary.

class Employee {
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    double calculateSalary(double basicSalary, double bonus, double overtime) {
        return basicSalary + bonus + overtime;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.calculateSalary(30000));
        System.out.println(emp.calculateSalary(30000, 5000));
        System.out.println(emp.calculateSalary(30000, 5000, 2000));
    }
}
