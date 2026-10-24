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

// ANSWER
public class Circle extends Shape {
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
