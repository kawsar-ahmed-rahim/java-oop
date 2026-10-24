// Exercise 13: Pass or Fail
// Problem: Check if the score is at least 33 to pass. Input: 30 Output: Fail

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 33) System.out.println("Pass");
        else System.out.println("Fail");
    }
}