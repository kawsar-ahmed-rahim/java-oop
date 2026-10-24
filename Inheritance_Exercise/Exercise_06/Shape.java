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
public class Shape {
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
