public class SavingsAccount extends Bank {

    public SavingsAccount(String accountNum, String customerName, double balance) {
        super(accountNum, customerName, balance);
    }

    @Override
    public double interest() {
        return 0.05 * getBalance();
    }
}
