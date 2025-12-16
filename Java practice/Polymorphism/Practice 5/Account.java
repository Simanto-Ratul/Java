public class Account {
    private String accHolder;
    private String accNum;
    private double balance;

    public Account(String accHolder, String accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }
}