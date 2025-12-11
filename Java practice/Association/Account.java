public class Account {
    private int accNum;
    private String accHolder;
    private double balance;

    public Account() {

    }

    public Account(int accNum, String accHolder, double balance) {
        this.accNum = accNum;
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails() {
        System.out.println("Account Number: " + getAccNum());
        System.out.println("Account Holder: " + getAccHolder());
        System.out.println("Balance: " + getBalance());
    }
}
