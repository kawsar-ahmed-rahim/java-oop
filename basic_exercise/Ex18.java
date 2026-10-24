// Exercise 18: Triangle Type
// Problem: Check triangle type:
// •
// All sides equal → Equilateral
// •
// Two equal → Isosceles
// •
// All different → Scalene Input: 3 3 3 Output: Equilateral

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) System.out.println("Equilateral");
        else if (a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }
}