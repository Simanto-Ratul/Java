public class ConstractorOverloading {
    public int x;
    public int y;

    public ConstractorOverloading(){
        System.out.println("Default contrutor called.");
    }

    public ConstractorOverloading(int x, int y){
        System.out.println("2nd cons called.");
    }

    public ConstractorOverloading(int x, int y, double z){
        System.out.println("3rd constructor called.");
    }

    public ConstractorOverloading(double x, float y, String z){
        System.out.println("4th cons called.");
    }

    public static void main(String[] args) {
        ConstractorOverloading c1 = new ConstractorOverloading();
        ConstractorOverloading c2 = new ConstractorOverloading(7, 9);
        ConstractorOverloading c3 = new ConstractorOverloading(5, 6 , 6.64);
        ConstractorOverloading c4 = new ConstractorOverloading(7.65, 4.54f, "Simanto");
    }
}
