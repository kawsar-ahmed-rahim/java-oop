// Constructor Overloading

class Calculator {

    int a;
    int b;
    int c;

    // Constructor with 3 parameters
    Calculator(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

        System.out.println("a + b + c = " + (a + b + c));
    }

    // Constructor with 2 parameters
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;

        System.out.println("a + b = " + (a + b));
    }
}

public class CalculatorMainConstructor {
    public static void main(String args[]) {

        new Calculator(10, 10, 20);

        System.out.println();

        new Calculator(10, 20);
    }
}