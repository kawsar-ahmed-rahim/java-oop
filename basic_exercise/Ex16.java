// Exercise 16: Integer Sign Detector
// Problem: Print "positive", "negative", or "zero". Input: 0 Output: Zero

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}