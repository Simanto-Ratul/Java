public class FixedAccount extends Account {
    private int year;

    public FixedAccount(String accHolder, String accNum, double balance, int year) {
        super(accHolder, accNum, balance);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public double calculateInterest() {
        return getBalance() * 0.05;
    }
}
