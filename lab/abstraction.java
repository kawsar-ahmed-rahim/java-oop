
// Create an abstract class Shape with abstract methods area() and perimeter(). Derive classes Circle, Rectangle, and Triangle to implement these methods and calculate the respective values.

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    Perimeter() {
        double perimeter = 2*3.1416*radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }

    @Override 
    void area() {
        double area = 3.1416*radius*radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override 
    void perimeter() {
        double perimeter = 2*3.1416*radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }


}

class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override 
    void area() {
        double area = length*breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override 
    void perimeter() {
        double perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}