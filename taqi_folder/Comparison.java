import java.util.Scanner;

class Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("first digit: ");
        int a = scan.nextInt();
        System.out.print("second digit: ");
        int b = scan.nextInt();

        System.out.println();

        if(a > b) {
            System.out.println("largest: " + a);
            System.out.println("Smallest: " + b);
        } else {
            System.out.println("largest: " + b);
            System.out.println("Smallest: " + a);
        }
    }
}
