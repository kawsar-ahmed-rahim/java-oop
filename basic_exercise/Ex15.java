// Exercise 15: Eligibility for Voting
// Problem: Check if a person is eligible to vote (age ≥ 18). Input: 17 Output: Not eligible to vote

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) System.out.println("Eligible to vote");
        else System.out.println("Not eligible to vote");
    }
}