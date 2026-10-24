// Exercise 10: Constructor Overloading
// Create a class Person.
// Variables:
// String name;
// int age;
// String city;
// Create three constructors:
// Person(String name)
// Person(String name, int age)
// Person(String name, int age, String city)
// Add:
// void display()

class Person {
    String name;
    int age;
    String city;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahim");
        Person p2 = new Person("Karim", 22);
        Person p3 = new Person("Hasan", 25, "Dhaka");

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}