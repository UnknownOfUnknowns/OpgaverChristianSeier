package Christian.OPG7_1;

public class Transactions {
    public static void main(String[] args) {

        Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);
        Account acct4 = new Account("Seier", 11225, 0.0);

        System.out.println(acct4);
        acct4.deposit(15841.15);
        System.out.println(acct4);

        acct1.deposit(25.85);
        acct4.deposit("5.09");
        acct2.deposit(3.0, 9.6);
        Account acct5 = new Account("Christian", 14141, 1000000);
        System.out.println(acct5);

        double smithBalance = acct2.deposit(500.00);

    }
}
