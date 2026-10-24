// Exercise 1: Rectangle
// Create a class Rectangle with overloaded constructors:
// 1. No-argument constructor → sets length = 1, width = 1.
// 2. Constructor with one argument → sets both length and width to the same value (square).
// 3. Constructor with two arguments → sets length and width to different values.
// Add a method area() to calculate the area.

class Rectangle {
    double length;
    double width;

    Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("r1 area: " + r1.area());
        System.out.println("r2 area: " + r2.area());
        System.out.println("r3 area: " + r3.area());
    }
}
