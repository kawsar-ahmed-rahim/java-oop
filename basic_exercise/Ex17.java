// Exercise 17: Login Attempt
// Problem: If username = "user" and password = "pass", allow login. Input: user, pass Output: Login Successful

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        String password = sc.next();
        if (username.equals("user") && password.equals("pass"))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");
    }
}