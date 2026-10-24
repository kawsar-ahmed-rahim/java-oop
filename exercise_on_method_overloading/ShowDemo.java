// Exercise 10: Method Overloading with Different Parameter Order
// Create two overloaded methods:
// show(String name, int age);
// show(int age, String name);
// Call:
// show("John", 25);
// show(25, "John");

class ShowDemo {
    void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    void show(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        ShowDemo demo = new ShowDemo();
        demo.show("John", 25);
        demo.show(25, "John");
    }
}
