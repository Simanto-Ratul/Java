public abstract class Bank {
    private String accountNum;
    private String customerName;
    private double balance;

    public Bank(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Bank(String accountNum, String customerName, double balance) {
        this.accountNum = accountNum;
        this.customerName = customerName;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(int amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited.");
    }

    public void Withdraw(int amount) {
        if (balance > amount && amount > 0) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn.");
        } else {
            System.out.println("Insuficiant Balance.");
        }
    }

    public abstract void  interest();

    public void display() {
        System.out.println("Account Number: " + getAccountNum());
        System.out.println("Account Holder: " + getCustomerName());
        System.out.println("Balance: " + getBalance());
    }
}
