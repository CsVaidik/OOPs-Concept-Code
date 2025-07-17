package Inhertance_03.EWalletSystem_MiniProject;

public class User {
    private String name;
    protected double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Balance: ₹" + balance);
    }
}