package Christian.OPG7_1;

import java.text.NumberFormat;

public class Account {

    private final double RATE = 0.035;
    private long acctNumber;
    private double balance;
    private String name;

    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    public Account(String name, long acctNumber) {
        this.name = name;
        this.acctNumber = acctNumber;
        balance = 0;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    public double deposit(double amount, double amount2) {
        balance = balance + amount + amount2;
        return balance;
    }

    public double deposit(String amount){
        balance = balance + Double.parseDouble(amount);
        return balance;
    }

    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return acctNumber + "\t" + name + "\t" + fmt.format(balance);
    }

}
