public class Customer {
    private String TrnsID;
    private Account[] acc;
    int count = 0;

    public Customer(String TrnsID, int arraySize) {
        this.TrnsID = TrnsID;
        this.acc = new Account[arraySize];
    }

    public void setTrnsID(String trnsID) {
        TrnsID = trnsID;
    }

    public String getTrnsID() {
        return TrnsID;
    }

    public void addAccount(Account ac) {
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] == null) {
                acc[i] = ac;
                count++;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Account inserted!");
        }
    }

    public void removeAccount(Account ac) {
        for (int i = 0; i < acc.length; i++) {
            if (acc[i] != ac) {
                acc[i] = null;
                count--;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Account removed!");
        }
    }

    public void showAllAccount() {
        for (int i = 0; i < acc.length; i++) {
            System.out.println("-----Account " + i + " information------");
            System.out.println("Account Holder: " + acc[i].getAccHolder());
            System.out.println("Account Number: " + acc[i].getAccNum());
            System.out.println("Balance: " + acc[i].getBalance());
        }
    }
}
