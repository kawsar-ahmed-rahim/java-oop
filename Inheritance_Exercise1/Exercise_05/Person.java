/*
 * ==================== QUESTION ====================
 * Exercise 5: University Management System
 * Base class: Person
 * - Instance variables:
 *    - name (String)
 *    - age (int)
 * - Constructor:
 *    - Initializes both variables and prints "Person constructor called".
 * - Methods:
 *    1. calculateAllowance() -> returns base allowance of 1000.
 *       - Print "Base allowance calculated in Person class."
 *    2. getRole() -> returns "General Person".
 *    3. displayInfo() -> prints name and age only.
 * Derived class 1: Student (extends Person)
 * - Instance variable:
 *    - studentId (String)
 * - Constructor:
 *    - Calls super(name, age) and prints "Student constructor called".
 * - Overridden methods:
 *    1. calculateAllowance() ->
 *       - Calls super.calculateAllowance() and adds +500 for study materials.
 *       - Print "Student allowance includes study materials."
 *    2. getRole() -> returns "Student".
 *    3. displayInfo() ->
 *       - Calls super.displayInfo() to print name and age.
 *       - Adds studentId and prints "Displaying Student information."
 *    4. getDailySchedule() -> new method printing a message like "Student attends classes
 *        and library sessions."
 * Derived class 2: Teacher (extends Person)
 * - Instance variable:
 *    - subject (String)
 * - Constructor:
 *    - Calls super(name, age) and prints "Teacher constructor called".
 * - Overridden methods:
 *    1. calculateAllowance() ->
 *       - Calls super.calculateAllowance() and adds +800 as teaching bonus.
 *       - Print "Teacher allowance includes teaching bonus."
 *    2. getRole() -> returns "Teacher".
 *    3. displayInfo() ->
 *       - Calls super.displayInfo() for base info.
 *       - Adds subject and prints "Displaying Teacher information."
 *    4. getDailySchedule() ->
 *       - Print "Teacher conducts lectures, grading, and student advising."
 * Derived class 3: Staff (extends Person)
 * - Instance variable:
 *    - department (String)
 * - Constructor:
 *    - Calls super(name, age) and prints "Staff constructor called".
 * - Overridden methods:
 *    1. calculateAllowance() ->
 *       - Calls super.calculateAllowance() and adds +300 operational allowance.
 *       - Print "Staff allowance includes operational bonus."
 *    2. getRole() -> returns "Administrative Staff".
 *    3. displayInfo() ->
 *       - Calls super.displayInfo() for base info.
 *       - Adds department and prints "Displaying Staff information."
 *    4. getDailySchedule() ->
 *       - Print "Staff handles office management and administrative support."
 * Main method tasks
 * 1. Create one Student, one Teacher, and one Staff object using sample data.
 * 2. Observe constructor chaining sequence: "Person constructor called" ->
 *     "Student/Teacher/Staff constructor called".
 * 3. For each object:
 *    - Call displayInfo() to view all inherited + subclass data.
 *    - Call calculateAllowance() to see how each subclass customizes the base logic
 *        differently using super.
 *    - Call getRole() to show overridden identity behavior.
 *    - Call getDailySchedule() to display their specific daily routines.
 * =================================================
 */

// ANSWER
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    public double calculateAllowance() {
        System.out.println("Base allowance calculated in Person class.");
        return 1000;
    }

    public String getRole() {
        return "General Person";
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
