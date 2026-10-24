// Exercise 5: Circle
// Create a class Circle.
// Variable:
// double radius;
// Create a constructor to initialize radius.
// Methods:
// double getArea()
// double getCircumference()
// void displayResult() {
    
// }

class Circle{
	double radius;

	Circle(double radius){
	this.radius = radius;
}
double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayResult() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

}

public class CircletMain {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(50.02);
	
	c1.displayResult();

        
    }
}
