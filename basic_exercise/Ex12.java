// Exercise 12: Absolute Value
// Problem: Print the absolute value of a number. Input: -19 Output: 19

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int abs = n < 0 ? -n : n;
        System.out.println(abs);
    }
}