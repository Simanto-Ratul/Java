public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.displayInfo();

        Person t = new Teacher();//Polymorphism
        t.displayInfo();

        p = new Teacher();//Polymorphism
        p.displayInfo();
    }
}
