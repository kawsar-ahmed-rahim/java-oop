// Exercise 19: Temperature Checker
// Problem: Print “Hot”, “Warm”, or “Cold” based on Celsius value:
// •
// ≥30 = Hot
// •
// 20–29 = Warm
// •
// <20 = Cold Input: 15 Output: Cold

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 30) System.out.println("Hot");
        else if (temp >= 20) System.out.println("Warm");
        else System.out.println("Cold");
    }
}