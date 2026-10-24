/*
 * ===================== QUESTION =====================
 * Exercise 1 — Student Information
 * Create a class Student with private fields name, id, and cgpa.
 *
 * Requirements:
 *  - Use private data members.
 *  - Create getter and setter methods.
 *  - CGPA must be between 0.0 and 4.0.
 *  - If an invalid CGPA is provided, display an appropriate message.
 *  - In main(), create a student, set the values, and display them.
 * ====================================================
 */
public class Student {

    // Private data members
    private String name;
    private int id;
    private double cgpa;

    // Constructor (cgpa is validated through the setter)
    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        setCgpa(cgpa);
    }

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.cgpa = 0.0;
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getCgpa() { return cgpa; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA (" + cgpa + "). CGPA must be between 0.0 and 4.0.");
        }
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
        System.out.println("CGPA : " + cgpa);
    }
}
