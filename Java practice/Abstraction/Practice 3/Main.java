public class Main {
    public static void main(String[] args) {
        Bank b1 = new FixedAccount("444828", 7000);
        Bank b2 = new SavingsAccount("9999321", "Simanto", 10000);

        b1.Deposit(500);
        b1.Withdraw(4000);
        b1.display();
        System.out.println("Fixed account interest: " + b1.interest());

        System.out.println();

        b2.Deposit(200);
        b2.Withdraw(6000);
        b2.display();
        System.out.println("Savings account interest: " + b2.interest());
    }
}
