public class FixedAccount extends Bank {

    public FixedAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }

    @Override
    public double interest() {
        return 0.07 * getBalance();
    }
}