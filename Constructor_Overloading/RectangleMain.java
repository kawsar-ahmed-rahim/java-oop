// Exercise 2: Rectangle
// Create a class Rectangle.
// Variables:
// double length;
// double width;
// Constructor overloading:
// Rectangle()
// Rectangle(double side)
// Rectangle(double length, double width)
// Create overloaded methods named calculate():
// double calculate()
// double calculate(double length)
// double calculate(double length, double width)

class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 0;
        width = 0;
    }

    Rectangle(double side) {
        length = side;
        width = side;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculate() {
        return length * width;
    }

    double calculate(double length) {
        return length * length;
    }

   
    double calculate(double length, double width) {
        return length * width;
    }
}

public class RectangleMain{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(5);

        Rectangle r3 = new Rectangle(10, 6);


        System.out.println("========== Rectangle 1 ==========");
        System.out.println("Constructor: Rectangle()");
        System.out.println("Length: " + r1.length);
        System.out.println("Width: " + r1.width);
        System.out.println("calculate(): " + r1.calculate());


        System.out.println("\n========== Rectangle 2 ==========");
        System.out.println("Constructor: Rectangle(double side)");
        System.out.println("Length: " + r2.length);
        System.out.println("Width: " + r2.width);
        System.out.println("calculate(): " + r2.calculate());
        System.out.println("calculate(7): " + r2.calculate(7));


        System.out.println("\n========== Rectangle 3 ==========");
        System.out.println("Constructor: Rectangle(double length, double width)");
        System.out.println("Length: " + r3.length);
        System.out.println("Width: " + r3.width);
        System.out.println("calculate(): " + r3.calculate());
        System.out.println("calculate(8): " + r3.calculate(8));
        System.out.println("calculate(8, 4): " + r3.calculate(8, 4));
    }
}