// Exercise 5: Grading System
// Problem: Print grade based on marks:
// •
// 90+ = A
// •
// 80+ = B
// •
// 70+ = C
// •
// below 70 = Fail Input: 75 Output: Grade: C

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 80) System.out.println("Grade: B");
        else if (marks >= 70) System.out.println("Grade: C");
        else System.out.println("Fail");
    }
}