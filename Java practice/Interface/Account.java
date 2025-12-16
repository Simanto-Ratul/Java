public abstract class Account {
    private String accNum;
    private String accName;
    private double balance;

    public Account(String accNum, String accName, double balance){
        this.accNum = accNum;
        this.accName  =accName;
        this.balance = balance;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void show();
}
