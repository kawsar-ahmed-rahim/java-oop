class Employee {
    String name;
    int id;
    double salary;

     public void display() {
        System.out.println();
        System.out.println("Employee information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
     }
}

public class EmployeeMain {
    public static void main (String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Taqi Tahmid";
        emp1.id = 2601;
        emp1.salary = 45000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.name = "Kazi Rehan";
        emp2.id = 2603;
        emp2.salary = 50000;
        emp2.display();

    }
}
