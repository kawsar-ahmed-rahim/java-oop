// Exercise 9: Convert Measurements
// Create overloaded methods named convert().
// convert(int meter); // meter to centimeter
// convert(double kilometer); // kilometer to meter
// convert(double value, String unit);
// For the third method, the user might call:
// convert(5.0, "km");
// convert(10.0, "meter");

class ConvertDemo {
    int convert(int meter) {
        return meter * 100;
    }

    double convert(double kilometer) {
        return kilometer * 1000;
    }

    double convert(double value, String unit) {
        if (unit.equals("km")) {
            return value * 1000;
        } else if (unit.equals("meter")) {
            return value * 100;
        }
        return value;
    }

    public static void main(String[] args) {
        ConvertDemo demo = new ConvertDemo();
        System.out.println(demo.convert(10));
        System.out.println(demo.convert(5.0));
        System.out.println(demo.convert(5.0, "km"));
        System.out.println(demo.convert(10.0, "meter"));
    }
}
