// Exercise 2: Find Area
// Create a class AreaCalculator and overload a method named area() to calculate:
// - Area of a square: area(int side)
// - Area of a rectangle: area(int length, int width)
// - Area of a circle: area(double radius)

class AreaCalculator {
    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println(calc.area(5));
        System.out.println(calc.area(4, 6));
        System.out.println(calc.area(3.5));
    }
}
