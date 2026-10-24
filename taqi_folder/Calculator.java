import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("first digit: ");
        int a = scan.nextInt();
        System.out.print("second digit: ");
        int b = scan.nextInt();

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        float div = (float)a / b;

        System.out.println();
        System.out.println("Summation: " + sum);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Divition: " + div);
    }
}
