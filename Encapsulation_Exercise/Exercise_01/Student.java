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
public class Student {
    private String name;
    private int age;
    private double cgpa;

    // Constructor: rejects invalid data so an invalid object is never created
    public Student(String name, int age, double cgpa) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("Name must not be null, empty or blank");
        }
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age must be between 18 and 30");
        }
        if (!isValidCgpa(cgpa)) {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 4.0");
        }
        this.name = name.trim();
        this.age = age;
        this.cgpa = cgpa;
    }

    private static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    private static boolean isValidAge(int age) {
        return age >= 18 && age <= 30;
    }

    private static boolean isValidCgpa(double cgpa) {
        return cgpa >= 0.0 && cgpa <= 4.0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name.trim();
        } else {
            System.out.println("Error: invalid name. Keeping previous value: " + this.name);
        }
    }

    public void setAge(int age) {
        if (isValidAge(age)) {
            this.age = age;
        } else {
            System.out.println("Error: age " + age + " is not between 18 and 30. "
                    + "Keeping previous value: " + this.age);
        }
    }

    public void setCgpa(double cgpa) {
        if (isValidCgpa(cgpa)) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Error: CGPA " + cgpa + " is not between 0.0 and 4.0. "
                    + "Keeping previous value: " + this.cgpa);
        }
    }

    // Uses the getter methods
    public void displayInfo() {
        System.out.println("Name: " + getName() + " | Age: " + getAge()
                + " | CGPA: " + getCgpa());
    }
}
