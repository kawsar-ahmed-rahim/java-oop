class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahim", "AI Engineer", 20000);
        System.out.println("Employee Info : (set by constructor):");
        emp1.displayInfo();

        emp1.setName("kawsar");
        emp1.setDesignation("Software Tester");
        emp1.setSalary(1800);
        System.out.println("Employee Info (set by setter function):");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Designation: " + emp1.getDesignation());
        System.out.println("Salary: " + emp1.getSalary());
    }
}