public class Main {
    public static void main(String[] args) {
        Account a1 = new FixedAccount("Simanto", "444828", 50000.00, 1);
        Account a2 = new SavingsAccount("Swapnil", "6663444", 57000.00);
        Account a3 = new Account("Rahul", "5553443", 34000.36);





        Customer c1 = new Customer("Tns2313245", 3);
        c1.addAccount(a1);
        c1.addAccount(a2);
        c1.addAccount(a3);
        //c1.removeAccount(a3);
        c1.showAllAccount();
    }
}
