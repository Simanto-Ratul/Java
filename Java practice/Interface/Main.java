public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("1", "Simanto", 500, 0.5);
        SavingsAccount s2 = new SavingsAccount("2", "Swapnil", 1000, 0.7);

        Person p1 = new Person(123, 4);
        Person p2 = new Person(456, 4);

        p1.addAccount(s1);
        p1.addAccount(s2);
        p1.showAccount();
        System.out.println();
        p2.addAccount(s1);
        p2.addAccount(s2);
        p2.removeAccount(s1);
        p2.showAccount();
    }
}
