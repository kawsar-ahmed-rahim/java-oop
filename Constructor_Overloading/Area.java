// Exercise 7: Area Calculator
// Create a class Area.
// Variables:
// double value1;
// double value2;
// Constructor overloading:
// Area()
// Area(double value1)
// Area(double value1, double value2)
// Method overloading:
// double calculate(int side)
// double calculate(int length, int width)
// double calculate(double radius)
// Calculate:
// •
// Square area
// •
// Rectangle area
// •
// Circle area

class Area {
    double value1;
    double value2;

    Area() {
        this.value1 = 0;
        this.value2 = 0;
    }

    Area(double value1) {
        this.value1 = value1;
        this.value2 = 0;
    }

    Area(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    double calculate(int side) {
        return side * side;
    }

    double calculate(int length, int width) {
        return length * width;
    }

    double calculate(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Square: " + a.calculate(5));
        System.out.println("Rectangle: " + a.calculate(4, 6));
        System.out.println("Circle: " + a.calculate(3.5));
    }
}