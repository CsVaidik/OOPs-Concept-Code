package Inhertance_03.EWalletSystem_MiniProject;

public class Merchant extends User {

    public Merchant(String name, double balance) {
        super(name, balance);
    }

    public void receivePayment(Customer customer, double amount) {
        this.balance += amount;
        System.out.println("💰 " + getName() + " received ₹" + amount + " from " + customer.getName());
    }
}