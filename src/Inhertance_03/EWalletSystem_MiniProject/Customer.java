package Inhertance_03.EWalletSystem_MiniProject;

public class Customer extends User {

    public Customer(String name, double balance) {
        super(name, balance);
    }

    public void pay(Merchant merchant, double amount) {
        if (amount <= 0) {
            System.out.println("❌ Invalid payment amount.");
        } else if (balance >= amount) {
            balance -= amount;
            merchant.receivePayment(this, amount);
            System.out.println("✅ Payment of ₹" + amount + " made to " + merchant.getName());
        } else {
            System.out.println("❌ Insufficient balance.");
        }
    }
}