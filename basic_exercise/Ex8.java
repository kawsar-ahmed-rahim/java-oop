// Exercise 8: Smallest of Three Numbers
// Problem: Determine the smallest among three numbers using if-else-if. Input: 5 9 3 Output: Smallest is 3

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int smallest;
        if (a <= b && a <= c)
            smallest = a;
        else if (b <= a && b <= c)
            smallest = b;
        else
            smallest = c;
        System.out.println("Smallest is " + smallest);
    }
}