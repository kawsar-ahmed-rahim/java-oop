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

class Course {

    private String courseCode;
    private String courseTitle;
    private int credit;
    private int enrolledStudents;
    private int maximumCapacity;

    Course(String courseCode, String courseTitle, int credit,
            int enrolledStudents, int maximumCapacity) {

        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
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

    public void setCourseTitle(String courseTitle) {
        if (courseTitle != null && !courseTitle.trim().isEmpty()) {
            this.courseTitle = courseTitle;
        } else {
            System.out.println("Error: Invalid course title!");
        }
    }

    public void setCredit(int credit) {
        if (credit >= 1 && credit <= 4) {
            this.credit = credit;
        } else {
            System.out.println("Error: Credit must be between 1 and 4!");
        }
    }

    public void setMaximumCapacity(int maximumCapacity) {
        if (maximumCapacity > 0 && maximumCapacity >= enrolledStudents) {
            this.maximumCapacity = maximumCapacity;
        } else {
            System.out.println("Error: Invalid maximum capacity!");
        }
    }

    public void enrollStudent() {
        if (enrolledStudents < maximumCapacity) {
            enrolledStudents++;
            System.out.println("Student enrolled successfully!");
        } else {
            System.out.println("Error: Course is full!");
        }
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
            System.out.println("Student dropped successfully!");
        } else {
            System.out.println("Error: No students enrolled!");
        }
    }

    public void displayInfo() {
        System.out.println("Course Code: " + getCourseCode());
        System.out.println("Course Title: " + getCourseTitle());
        System.out.println("Credit: " + getCredit());
        System.out.println("Enrolled Students: " + getEnrolledStudents());
        System.out.println("Maximum Capacity: " + getMaximumCapacity());
    }

    public static void main(String[] args) {

        Course c = new Course("CSE101", "Java Programming", 3, 2, 5);

        System.out.println("Initial Course Information:");
        c.displayInfo();

        System.out.println("\nAfter Updating Course Information:");

        c.setCourseTitle("Object Oriented Programming");
        c.setCredit(4);
        c.displayInfo();

        System.out.println("\nAfter Enrolling Students:");

        c.enrollStudent();
        c.enrollStudent();
        c.displayInfo();

        System.out.println("\nTrying to Enroll Another Student:");

        c.enrollStudent();

        System.out.println("\nAfter Dropping a Student:");

        c.dropStudent();
        c.displayInfo();

        System.out.println("\nTesting Invalid Values:");

        c.setCourseTitle(" ");
        c.setCredit(5);
        c.setMaximumCapacity(2);

        c.displayInfo();
    }
}
