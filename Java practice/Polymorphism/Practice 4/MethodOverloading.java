public class MethodOverloading {
    
    public void showDetails(){
        System.out.println("Nothing to show.");
    }

    public void showDetails(int a){
        System.out.println(a);
    }

    public int showDetails(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.showDetails();
        m1.showDetails(10);
        System.out.println(m1.showDetails(25, 35));
    }
}
