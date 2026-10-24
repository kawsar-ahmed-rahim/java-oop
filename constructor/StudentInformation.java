// Exercise 1: Student Information
// Create a class Student.
// Variables:
// String name;
// int age;
// double cgpa;
// Create a constructor to initialize all variables.
// Add a method:
// void displayInfo()

class Student {
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void displayInfo() {
        System.out.println("Data of the Student:");
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("cgpa: " + cgpa);
        System.out.println("--------------------");
    }

}

public class StudentInformation {
    public static void main(String args[]) {
        Student s1 = new Student("Rahim", 22, 3.99);
        Student s2 = new Student("kahim", 23, 2.10);

        s1.displayInfo();
        s2.displayInfo();
    }
}