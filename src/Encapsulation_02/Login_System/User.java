package Encapsulation_02.Login_System;

public class User {

    // Private fields
    private String username;
    private String password;

    // Set username
    public void setUsername(String username) {
        this.username = username;
    }

    // Set password with validation
    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters long!");
        }
    }

    // Login method to verify credentials
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // No getter for password to protect it ❌
}
