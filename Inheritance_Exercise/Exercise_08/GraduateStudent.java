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
public class GraduateStudent extends Student {
    private String researchTopic;
    private double cgpa;

    public GraduateStudent(String name, int age, String studentId, String department,
                           String researchTopic, double cgpa) {
        super(name, age, studentId, department);
        this.researchTopic = researchTopic;
        this.cgpa = cgpa;
        System.out.println("GraduateStudent constructor called");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();       // reuse Student's (and Person's) output
        System.out.println("Research Topic : " + researchTopic);
        System.out.println("CGPA           : " + cgpa);
    }
}
