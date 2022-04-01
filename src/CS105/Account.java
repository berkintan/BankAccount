package CS105;

public class Account {
    private int number;
    private double balance;
    private String currency;

    public Account(int n, double b, String c) {
        number = n;
        if ( b > 0) {
            balance = b;
        } else {
            balance = 0;
        }
        currency = c;
    }

    public void deposit(double d) {
        if(d > 0) {
            balance = balance + d;
            System.out.println(d + " " + currency + " have been deposited");
            System.out.println("The balance is " + balance + " " + currency);
        } else {
            System.out.println("The amount should be positive!");
        }
    }
    public void withdraw(double d) {
        if(d > 0) {
            if(balance < d) {
                System.out.println("Account does not have " + d + " " + currency);
            } else {
                balance = balance - d;
                System.out.println(d + " " + currency + " have been withdrawn");
                System.out.println("The balance is " + balance + " " + currency);
            }

        } else {
            System.out.println(" The amount should be positive!");
        }
    }
    public void report() {
        System.out.println("Account " + number + " has " + balance + " " + currency + ".");
    }
    public int getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String c) {
        currency = c;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
