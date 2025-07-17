package Inhertance_03.EWalletSystem_MiniProject;

public class EWalletApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Vaidik", 1000.0);
        Merchant m1 = new Merchant("Flipkart", 5000.0);

        System.out.println("---- Initial Balances ----");
        c1.displayInfo();
        m1.displayInfo();

        System.out.println("\n💳 Transaction: Vaidik pays ₹300 to Flipkart");
        c1.pay(m1, 300.0);

        System.out.println("\n---- Updated Balances ----");
        c1.displayInfo();
        m1.displayInfo();
    }
}