// Exercise 9: Point in 2D Space
// Create a class Point with overloaded constructors:
// 1. No-argument constructor → initializes (0,0).
// 2. Constructor with x.
// 3. Constructor with x and y.
// Add a method distanceFromOrigin() that returns the distance of the point from (0,0).

class Point {
    double x;
    double y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(double x) {
        this.x = x;
        this.y = 0;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Distance from origin: " + p.distanceFromOrigin());
    }
}
