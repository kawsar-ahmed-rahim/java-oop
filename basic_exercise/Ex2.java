// Exercise 2: Even or Odd
// Problem: Check if a number is even or odd using if-else. Input: 14 Output: Even

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");
    }
}