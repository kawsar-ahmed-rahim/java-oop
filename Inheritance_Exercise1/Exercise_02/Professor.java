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
public class Professor extends Staff {
    private String department;

    public Professor(int staffId, String name, String department) {
        super(staffId, name);      // calls the Staff constructor first
        this.department = department;
        System.out.println("Professor constructor called");
    }

    public void displayInfo() {
        System.out.println("Staff ID  : " + staffId);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
    }
}
