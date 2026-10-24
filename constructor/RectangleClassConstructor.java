// Exercise 2: Rectangle
// Create a class Rectangle.
// Variables:
// double length;
// double width;
// Create a constructor that initializes length and width.
// Add these methods:
// double calculateArea()
// double calculatePerimeter()
// void display()
// Formula:
// Area = length × width
// Perimeter = 2 × (length + width)

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("--------------------");
    }

}

public class RectangleClassConstructor {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(11, 5);

        rect1.display();
        rect2.display();
    }
}
