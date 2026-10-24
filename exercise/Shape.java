// Exercise 5: Shape
// •
// Constructors:
// 1.
// Default constructor → "Unknown Shape".
// 2.
// Constructor with shape name.
// •
// Method Overloading:
// o
// area(int side) → square.
// o
// area(int length, int width) → rectangle.
// o
// area(double radius) → circle.
// •
// Normal Method:
// o
// showShape() → print shape type.

class Shape {
    String shapeName;

    Shape() {
        this.shapeName = "Unknown Shape";
    }

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    void showShape() {
        System.out.println("Shape: " + shapeName);
    }

    public static void main(String[] args) {
        Shape shape = new Shape("Square");
        shape.showShape();
        System.out.println("Square Area: " + shape.area(5));
        System.out.println("Rectangle Area: " + shape.area(4, 6));
        System.out.println("Circle Area: " + shape.area(3.5));
    }
}