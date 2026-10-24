/*
 * ==================== QUESTION ====================
 * Exercise 3: Animal and Dog
 * Create a superclass Animal with attributes name and weight. Create a subclass Dog with
 *     an additional attribute breed.
 * Requirements:
 * 1. Write parameterized constructors for both classes.
 * 2. Initialize inherited data using super().
 * 3. Create a method makeSound() in Animal that prints "Animal makes a sound".
 * 4. Override makeSound() in Dog to print "Dog barks: Woof Woof!".
 * 5. Create two Dog objects with different values.
 * 6. Display their information and sounds.
 * =================================================
 */

// ANSWER
public class Animal {
    protected String name;
    protected double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Weight: " + weight + " kg");
    }
}
