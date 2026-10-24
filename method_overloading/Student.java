// Exercise 2: Student Information
// Create a class Student with overloaded constructors:
// 1. Accepts only name.
// 2. Accepts name and age.
// 3. Accepts name, age, and department.
// Add a method displayInfo() to print student details.

class Student {
    String name;
    int age;
    String department;

    Student(String name) {
        this.name = name;
        this.age = 0;
        this.department = "Unknown";
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.department = "Unknown";
    }

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Student s = new Student("Rahim", 20, "CSE");
        s.displayInfo();
    }
}
