/*
 * ==================== QUESTION ====================
 * Exercise 1: Student Information Management
 * Create a Java class named Student with the following private attributes:
 * Attribute   Data type
 * name        String
 * age         int
 * cgpa        double
 * Requirements:
 * 1. Create a parameterized constructor to initialize the attributes.
 * 2. Implement getter and setter methods for all attributes.
 * 3. In setAge(), accept only values between 18 and 30.
 * 4. In setCgpa(), accept only values between 0.0 and 4.0.
 * 5. In setName(), reject null, empty, or whitespace-only names.
 * 6. If invalid data is provided, display an error message and keep the previous value.
 * 7. Create a displayInfo() method that uses getter methods.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Rahim", 21, 3.45);
        System.out.println("Initial data:");
        student.displayInfo();

        System.out.println();
        System.out.println("Trying invalid updates:");
        student.setAge(15);
        student.setAge(45);
        student.setCgpa(4.5);
        student.setCgpa(-1);
        student.setName("");
        student.setName("   ");
        student.setName(null);
        student.displayInfo();

        System.out.println();
        System.out.println("Trying valid updates:");
        student.setAge(23);
        student.setCgpa(3.80);
        student.setName("Rahim Uddin");
        student.displayInfo();

        System.out.println();
        System.out.println("Invalid data in the constructor:");
        try {
            new Student("", 20, 3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Object not created: " + e.getMessage());
        }
    }
}
