public class Test {
    public static void main(String[] args) {

        //Runtime Polymorphism

        person p = new person();
        p.display();

        p = new teacher();
        p.display();

        p = new Student();
        p.display();
    }
}
