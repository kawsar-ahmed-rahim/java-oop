// Exercise 14: Weekday Name
// Problem: Take an integer (1–7) and return the day name. Use nested if-else. Input: 3 Output: Wednesday


import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day == 1) System.out.println("Sunday");
        else if (day == 2) System.out.println("Monday");
        else if (day == 3) System.out.println("Tuesday");
        else if (day == 4) System.out.println("Wednesday");
        else if (day == 5) System.out.println("Thursday");
        else if (day == 6) System.out.println("Friday");
        else if (day == 7) System.out.println("Saturday");
        else System.out.println("Invalid day");
    }
}