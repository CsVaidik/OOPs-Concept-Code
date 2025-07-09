package Encapsulation_02.Login_System;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user = new User();

        // Set credentials
        user.setUsername("vaidik123");
        user.setPassword("secret123");

        // Try login
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String u = sc.nextLine();

        System.out.print("Enter password: ");
        String p = sc.nextLine();

        if (user.login(u, p)) {
            System.out.println("✅ Login Successful. Welcome, " + u + "!");
        } else {
            System.out.println("❌ Login Failed. Invalid username or password.");
        }

        sc.close();
    }
}
