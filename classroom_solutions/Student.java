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

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.cgpa = 0.0;
    }

    // Parameterized constructor (cgpa validated through the setter)
    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        setCgpa(cgpa);
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

    public static void main(String[] args) {
        Student s = new Student();   // create a student
        s.setName("Rahim");          // set the values
        s.setId(101);
        s.setCgpa(3.75);
        s.display();                 // display them

        System.out.println("\n--- Trying an invalid CGPA ---");
        s.setCgpa(4.5);              // invalid -> message shown, old value kept
        System.out.println("CGPA after invalid attempt: " + s.getCgpa());
    }
}
