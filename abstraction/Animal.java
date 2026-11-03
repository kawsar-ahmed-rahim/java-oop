// Exercise 2: Animal Sounds
// Create an abstract class Animal with:
// •
// An abstract method makeSound().
// •
// A concrete method sleep() that prints "Animal is sleeping".
// Create three subclasses: Dog, Cat, and Cow.
// Expected output:
// Dog says: Woof!
// Cat says: Meow!
// Cow says: Moo!
// Animal is sleeping

abstract class Animal {

    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Cow extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cow says: Moo!");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        dog.sleep();
    }
}
