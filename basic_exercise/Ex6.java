// Exercise 6: Age Group
// Problem: Print category based on age:
// •
// <13 = Child
// •
// 13–19 = Teen
// •
// 20+ = Adult Input: 16 Output: Teen

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 13)
            System.out.println("Child");
        else if (age <= 19)
            System.out.println("Teen");
        else
            System.out.println("Adult");
    }
}