package CS105;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(1, 100, "TL");
        Account account2 = new Account(2, 200, "USD");
        Account account3 = new Account(3, -200, "USD");

        account1.deposit(300);
        account2.deposit(-300);

        account1.withdraw(300);
        account2.withdraw(600);

        account1.report();
        account2.report();
        account3.report();
    }
}
