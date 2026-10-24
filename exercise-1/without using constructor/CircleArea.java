// Create a Circle class with a field: radius.
// 
// Assign value directly.
// 
// Write methods to calculate and display the area and circumference.

class Circle {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.display();
    }
}
