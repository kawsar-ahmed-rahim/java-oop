// Exercise 4: Number is Zero or Not
// Problem: Determine if a number is zero. Input: 0 Output: Zero

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) System.out.println("Zero");
        else System.out.println("Not Zero");
    }
}