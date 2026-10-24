/*
 * ==================== QUESTION ====================
 * Exercise 8: University Management System - Multilevel Inheritance
 * Design the following inheritance hierarchy:
 * Person (name, age)  ->  Student (studentId, department)  ->  GraduateStudent
 *     (researchTopic, cgpa)
 * Requirements:
 * 1. Create a parameterized constructor in each class.
 * 2. Use super() at each inheritance level.
 * 3. Define displayInfo() in Person.
 * 4. Override displayInfo() in Student and GraduateStudent.
 * 5. Use super.displayInfo() to reuse the inherited implementation.
 * 6. Create a GraduateStudent object and display all its information.
 * Challenge: Print a message from every constructor to demonstrate constructor execution
 *     order.
 * =================================================
 */

// ANSWER
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    public void displayInfo() {
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
    }
}
