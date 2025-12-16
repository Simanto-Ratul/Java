public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accNum, String accName, double balance, double rate) {
        super(accNum, accName, balance);
        this.rate = rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public void show() {
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Account Holder: " + getAccName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Rate: " + getRate());
    }
}
