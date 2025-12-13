public class Account {
    private String AccountHolder;
    private String AccountNum;
    private double balance;

    public Account(String AccountHolder, String AccountNum, double balance) {
        this.AccountHolder = AccountHolder;
        this.AccountNum = AccountNum;
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        AccountHolder = accountHolder;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return AccountHolder;
    }

    public String getAccountNum() {
        return AccountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNum());
        System.out.println("Balance: " + getBalance());
    }
}
