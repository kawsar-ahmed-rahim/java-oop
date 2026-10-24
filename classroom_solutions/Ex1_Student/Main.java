/*
 * Exercise 1 — Student Information (driver class)
 * In main(), create a student, set the values, and display them.
 */
public class Main {
    public static void main(String[] args) {
        Student s = new Student();       // create a student
        s.setName("Rahim");              // set the values
        s.setId(101);
        s.setCgpa(3.75);
        s.display();                     // display them

        System.out.println("\n--- Trying an invalid CGPA ---");
        s.setCgpa(4.5);                  // invalid -> message shown, old value kept
        System.out.println("CGPA after invalid attempt: " + s.getCgpa());
    }
}
