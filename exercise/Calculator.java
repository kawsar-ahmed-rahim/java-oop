// Exercise 1: Calculator
// Constructors:

// No-argument constructor → default mode = "Basic".

// Constructor with mode name.

// Method Overloading:

// add(int a, int b)

// add(double a, double b)

// add(int a, int b, int c)

// Normal Method:

// showMode() → print calculator mode.

class Calculator {
    String mode;

    Calculator() {
        this.mode = "Basic";
    }

    Calculator(String mode) {
        this.mode = mode;
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    void showMode() {
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.showMode();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(1, 2, 3));
    }
}