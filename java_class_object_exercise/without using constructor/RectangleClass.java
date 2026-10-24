// 2.Create a Rectangle class with attributes: length, width.

// Method calculateArea() to return area.

// Method calculatePerimeter() to return perimeter.

// In main, create a Rectangle object and display its area and perimeter.

class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        
        rect.length = 22;
        rect.width = 20;

        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
