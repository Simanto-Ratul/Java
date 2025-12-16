public class SavingsAccount extends Account {
    private String tranID;
    private double rate = 0.0;

    public SavingsAccount(String accName, String accNum, double balance, String tranID, double rate) {
        super(accName, accNum, balance);
        this.tranID = tranID;
        this.rate = rate;
    }

    public String getTranID() {
        return tranID;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public void showDetails() {
        System.out.println("Account Name: " + getAccName());
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Balance: " + getBalance());
        System.out.println("Transaction ID: " + getTranID());
        System.out.println("Rate :" + getRate());
    }

}
