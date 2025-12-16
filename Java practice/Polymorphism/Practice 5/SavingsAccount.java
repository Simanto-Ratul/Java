public class SavingsAccount extends Account {

    public SavingsAccount(String accHolder, String accNum, double balance) {
        super(accHolder, accNum, balance);
    }

    public double calculateInterest() {
        return 0.07 * getBalance();
    }
}
