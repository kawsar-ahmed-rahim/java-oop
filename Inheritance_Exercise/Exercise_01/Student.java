/*
 * ==================== QUESTION ====================
 * Exercise 1: Person and Student
 * Create a superclass named Person with two attributes: name and age. Create a subclass
 *     named Student with an additional attribute studentId.
 * Requirements:
 * 1. Create a parameterized constructor in Person.
 * 2. Use super(name, age) in the Student constructor.
 * 3. Create a method displayInfo() in Person that prints the name and age.
 * 4. Override displayInfo() in Student to print the name, age, and student ID.
 * 5. Create two Student objects and display their information.
 * =================================================
 */

// ANSWER
public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);          // call the Person constructor
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Student ID: " + studentId);
    }
}
