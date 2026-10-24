// Exercise 1: Positive or Negative
// Problem: Write a Java program that checks if a number is positive or negative. Input: -5 Output: Negative number

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) System.out.println("Negative number");
        else System.out.println("Positive number");
    }
}