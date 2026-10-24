/*
 * ==================== QUESTION ====================
 * Exercise 5: University Course Registration System
 * Create a class named Course with the following private attributes:
 * Attribute          Validation
 * courseCode         Cannot be changed after initialization
 * courseTitle        Cannot be empty
 * credit             Must be between 1 and 4
 * enrolledStudents   Must not be negative
 * maximumCapacity    Must be greater than zero
 * Requirements:
 * 1. Create a parameterized constructor.
 * 2. Provide appropriate getters.
 * 3. Implement setters only for attributes that should be directly modifiable.
 * 4. Implement setCredit() with range validation.
 * 5. Implement setCourseTitle() with non-empty validation.
 * 6. Do not provide a public setter for enrolledStudents.
 * 7. Create enrollStudent() that increments enrollment only if space is available.
 * 8. Create dropStudent() that decrements enrollment only if at least one student is
 *     enrolled.
 * 9. Prevent reducing maximumCapacity below the number of currently enrolled students.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Course course = new Course("CSE-101", "Intro to Programming", 3, 0, 3);
        System.out.println(course.getCourseCode() + " - " + course.getCourseTitle()
                + " (" + course.getCredit() + " credits)");

        System.out.println();
        course.enrollStudent();
        course.enrollStudent();

        System.out.println();
        course.setCredit(5);
        course.setCredit(4);
        course.setCourseTitle("");
        course.setCourseTitle("Introduction to Programming");
        course.setMaximumCapacity(1);     // rejected: 2 students are enrolled
        course.setMaximumCapacity(0);     // rejected: must be greater than zero
        course.setMaximumCapacity(2);     // accepted: equals the enrolled count

        System.out.println();
        course.enrollStudent();           // rejected: course is full
        course.dropStudent();
        course.dropStudent();
        course.dropStudent();             // rejected: nobody is enrolled

        System.out.println();
        System.out.println(course.getCourseTitle() + " | credits: " + course.getCredit()
                + " | enrolled: " + course.getEnrolledStudents()
                + "/" + course.getMaximumCapacity());
    }
}
