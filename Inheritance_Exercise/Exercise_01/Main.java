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
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 20, "S-1001");
        Student s2 = new Student("Karim", 22, "S-1002");

        System.out.println("--- Student 1 ---");
        s1.displayInfo();

        System.out.println();
        System.out.println("--- Student 2 ---");
        s2.displayInfo();
    }
}
