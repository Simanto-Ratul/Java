import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(444828, "Simanto", 4000.45);
        System.out.println("======Account 1 Details=======");
        System.out.println(" ");
        a1.showDetails();

        Account a2 = new Account(6341018, "Swapnil", 42312.736);
        System.out.println("======Account 2 Details=======");
        System.out.println(" ");
        a2.showDetails();

        Account a3 = new Account(9752715, "Rahul", 52432.736);
        System.out.println("======Account 3 Details=======");
        System.out.println(" ");
        a3.showDetails();

        Customer c1 = new Customer("01919444828", a1);
        System.out.println("======Customer 1 Details=======");
        System.out.println(" ");
        c1.showDetails();

        Customer c2 = new Customer("017353535", a2);
        System.out.println("======Customer 2 Details=======");
        System.out.println(" ");
        c2.showDetails();

        Customer c3 = new Customer("0183654545", a3);
        System.out.println("======Customer 3 Details=======");
        System.out.println(" ");
        c3.showDetails();

    }
}
