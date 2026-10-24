
abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal.");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("You are creating a new horse.");
    }

    public void walk() {

        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class AbstractionConstraction {
    public static void main(String args[]) {
        Horse horse = new Horse();
    }
}
