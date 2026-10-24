// Exercise 6: Print Different Data Types
// Create overloaded methods named print() that accept:
// print(int number);
// print(double number);
// print(String text);
// print(boolean value);

class PrintDemo {
    void print(int number) {
        System.out.println(number);
    }

    void print(double number) {
        System.out.println(number);
    }

    void print(String text) {
        System.out.println(text);
    }

    void print(boolean value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        PrintDemo demo = new PrintDemo();
        demo.print(100);
        demo.print(45.67);
        demo.print("Java");
        demo.print(true);
    }
}
