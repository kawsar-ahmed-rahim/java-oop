// 7.Create a Circle class with a field: radius.
// 
// Assign value directly.
// 
// Write methods to calculate and display the area and circumference.

class Circle {
    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

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

public class CircleAreaConstructor {
    public static void main(String[] args) {
        Circle c = new Circle(8);
       

        c.display();
    }
}
