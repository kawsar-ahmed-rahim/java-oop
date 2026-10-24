/*
 * ==================== QUESTION ====================
 * Exercise 2: University Staff System
 * 1. Base class: Staff
 *    - Instance variables: staffId, name
 *    - Constructor: initialize variables, print "Staff constructor called".
 * 2. Derived class: Professor (extends Staff)
 *    - Instance variable: department
 *    - Constructor: use super() and print "Professor constructor called".
 * 3. Method: displayInfo() to print all details.
 * 4. Main method:
 *    - Create a Professor object with sample data.
 *    - Display info.
 * =================================================
 */

// ANSWER
public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(501, "Dr. Hasan", "Computer Science");
        System.out.println();
        professor.displayInfo();
    }
}
