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
public class Main {
    public static void main(String[] args) {
        // Challenge: Rectangle and Circle objects stored in one Shape[] array
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
