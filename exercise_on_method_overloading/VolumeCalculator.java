// Exercise 7: Volume Calculator
// Create a class VolumeCalculator and overload volume() to calculate the volume of:
// - Cube
// - Rectangular box
// - Cylinder
// Suggested methods:
// volume(int side);
// volume(int length, int width, int height);
// volume(double radius, double height);

class VolumeCalculator {
    int volume(int side) {
        return side * side * side;
    }

    int volume(int length, int width, int height) {
        return length * width * height;
    }

    double volume(double radius, double height) {
        return 3.14159 * radius * radius * height;
    }

    public static void main(String[] args) {
        VolumeCalculator calc = new VolumeCalculator();
        System.out.println(calc.volume(4));
        System.out.println(calc.volume(2, 3, 4));
        System.out.println(calc.volume(2.5, 5.0));
    }
}
