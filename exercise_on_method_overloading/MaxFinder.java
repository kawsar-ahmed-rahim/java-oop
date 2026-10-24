// Exercise 4: Find Maximum
// Create overloaded methods called max() that find:
// - Maximum between two integers
// - Maximum among three integers
// - Maximum between two doubles

class MaxFinder {
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        MaxFinder finder = new MaxFinder();
        System.out.println(finder.max(10, 25));
        System.out.println(finder.max(10, 50, 30));
        System.out.println(finder.max(4.5, 8.7));
    }
}
