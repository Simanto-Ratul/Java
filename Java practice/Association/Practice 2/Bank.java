public class Bank {
    private String bankName;
    private Account[] account;
    private int count = 0;

    public Bank(String bankName, int size) {
        this.bankName = bankName;
        account = new Account[size];
    }

    public void addAccount(Account acc) {
        if (count < account.length) {
            account[count] = acc;
            count++;
        } else {
            System.out.println("Account limit reached!");
        }
    }

    public void showBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Informations: ");
        for (int i = 0; i < count; i++) {
            account[i].showAccountInfo();
        }
    }
}
