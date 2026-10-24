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
class Animal {
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

class Dog extends Animal {
    private String breed;

    public Dog(String name, double weight, String breed) {
        super(name, weight);       // initialize inherited data
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Weight: " + weight
                + " kg, Breed: " + breed);
    }
}

public class AnimalDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", 25.5, "Labrador");
        Dog dog2 = new Dog("Max", 32.0, "German Shepherd");

        System.out.println("--- Dog 1 ---");
        dog1.displayInfo();
        dog1.makeSound();

        System.out.println();
        System.out.println("--- Dog 2 ---");
        dog2.displayInfo();
        dog2.makeSound();
    }
}
