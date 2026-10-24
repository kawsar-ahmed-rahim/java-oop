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
class Course {
    private final String courseCode;      // cannot be changed after initialization
    private String courseTitle;
    private int credit;                   // 1 - 4
    private int enrolledStudents;         // changed only by enroll/drop
    private int maximumCapacity;

    public Course(String courseCode, String courseTitle, int credit,
                  int enrolledStudents, int maximumCapacity) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code must not be empty");
        }
        if (courseTitle == null || courseTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Course title must not be empty");
        }
        if (credit < 1 || credit > 4) {
            throw new IllegalArgumentException("Credit must be between 1 and 4");
        }
        if (maximumCapacity <= 0) {
            throw new IllegalArgumentException("Maximum capacity must be greater than zero");
        }
        if (enrolledStudents < 0 || enrolledStudents > maximumCapacity) {
            throw new IllegalArgumentException(
                    "Enrolled students must be between 0 and the maximum capacity");
        }
        this.courseCode = courseCode.trim();
        this.courseTitle = courseTitle.trim();
        this.credit = credit;
        this.enrolledStudents = enrolledStudents;
        this.maximumCapacity = maximumCapacity;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getCredit() {
        return credit;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    // Only courseTitle, credit and maximumCapacity may be modified directly.

    public void setCourseTitle(String courseTitle) {
        if (courseTitle == null || courseTitle.trim().isEmpty()) {
            System.out.println("Error: course title cannot be empty.");
        } else {
            this.courseTitle = courseTitle.trim();
        }
    }

    public void setCredit(int credit) {
        if (credit < 1 || credit > 4) {
            System.out.println("Error: credit must be between 1 and 4.");
        } else {
            this.credit = credit;
        }
    }

    public void setMaximumCapacity(int maximumCapacity) {
        if (maximumCapacity <= 0) {
            System.out.println("Error: maximum capacity must be greater than zero.");
        } else if (maximumCapacity < enrolledStudents) {
            System.out.println("Error: cannot reduce capacity to " + maximumCapacity
                    + " while " + enrolledStudents + " students are enrolled.");
        } else {
            this.maximumCapacity = maximumCapacity;
        }
    }

    public void enrollStudent() {
        if (enrolledStudents < maximumCapacity) {
            enrolledStudents++;
            System.out.println("Student enrolled. Enrolled: " + enrolledStudents
                    + "/" + maximumCapacity);
        } else {
            System.out.println("Enrollment failed: the course is full ("
                    + enrolledStudents + "/" + maximumCapacity + ").");
        }
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println("Student dropped. Enrolled: " + enrolledStudents
                    + "/" + maximumCapacity);
        } else {
            System.out.println("Drop failed: no students are enrolled.");
        }
    }
}

public class CourseRegistration {
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
