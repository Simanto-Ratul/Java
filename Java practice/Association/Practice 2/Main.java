public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("Brac Bank Limited", 3);
        Account a1 = new Account("Mr. A", "5342324", 34900.00);
        Account a2 = new Account("Mr. B", "7243334", 52433.00);
        Account a3 = new Account("Mr. C", "8000000", 73534.00);
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        b1.showBankInfo();
    }
}
