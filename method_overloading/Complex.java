// Exercise 7: Complex Number
// Create a class Complex with overloaded constructors:
// 1. No-argument constructor → initializes real = 0, imaginary = 0.
// 2. Constructor with one argument → initializes real with that value and imaginary = 0.
// 3. Constructor with two arguments → initializes both real and imaginary parts.
// Add a method display() to print the complex number in form a + bi.

class Complex {
    double real;
    double imaginary;

    Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c = new Complex(3, 5);
        c.display();
    }
}
