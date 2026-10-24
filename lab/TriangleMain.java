class Triangle {
    int height;
    int base;

    public void Area() {
        double area = height * base * 0.5;
        System.out.println("Area is " + area);
    }
}

public class TriangleMain {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.height = 10;
        t.base = 5;
        t.Area();
    }
}
