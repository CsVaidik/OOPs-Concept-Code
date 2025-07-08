package Encapsulation_02;

public class BankAccount {
    private String AccountHolder;
    private double balance;

    public BankAccount(String AccountHolder){
        this.AccountHolder = AccountHolder;
        this.balance = 0.0;
    }

    public void deposite(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited Amount : "+amount);

        }else System.out.println("Invalid Entry");
    }

    public void withdraw(double amount){
        if(balance > amount && amount > 0){
            balance -= amount;
            System.out.println("Withdraw Amount : "+amount);

        }else System.out.println("Insufficient Fund");
    }

    public String getAccountHolder(){
        return AccountHolder;
    }
    public double getBalance(){
        return balance;
    }


}
