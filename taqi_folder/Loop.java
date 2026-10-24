import java.util.Scanner;

class Loop {
    public static void main() {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 10; i++) {
            System.out.print("enter " + (i + 1) + " digit: ");
            int temp = scan.nextInt();
            sum += temp;
        }

        System.out.println("sum of digits: " + sum);
    }
}
