/*
 * ==================== QUESTION ====================
 * Exercise 6: Shape Area Calculator
 * Create a superclass Shape with an attribute color. Create two subclasses: Rectangle and
 *     Circle.
 * Requirements:
 * 1. Define a parameterized constructor in Shape.
 * 2. Call the superclass constructor from both subclasses.
 * 3. Define calculateArea() in Shape, returning 0.0.
 * 4. Override calculateArea() in Rectangle using length * width.
 * 5. Override calculateArea() in Circle using Math.PI * radius * radius.
 * 6. Override displayInfo() to display color, shape type, and area.
 * Challenge: Store Rectangle and Circle objects inside a Shape[] array and calculate their
 *     areas using a loop.
 * =================================================
 */


class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.printf("Color: %s | Shape: %s | Area: %.2f%n",
                color, "Generic Shape", calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Color: %s | Shape: %s | Area: %.2f%n",
                color, "Rectangle", calculateArea());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Color: %s | Shape: %s | Area: %.2f%n",
                color, "Circle", calculateArea());
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
       
        Shape[] shapes = {
            new Rectangle("Red", 5, 3),
            new Circle("Blue", 4),
            new Rectangle("Green", 7.5, 2),
            new Circle("Yellow", 2.5)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.displayInfo();                 // overridden version runs
            totalArea += shape.calculateArea();  // area calculated in a loop
        }

        System.out.printf("Total area of all shapes: %.2f%n", totalArea);
    }
}
