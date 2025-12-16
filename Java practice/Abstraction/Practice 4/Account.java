public class Account {
    private String accName;
    private String accNum;
    private double balance;

    public Account(String accName, String accNum, double balance){
        this.accName = accName;
        this.accNum = accNum;
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

    

}
