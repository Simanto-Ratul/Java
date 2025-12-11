public class Triangle extends Shape{
    public double base;
    public double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area(){
        System.out.print("Area for triangle : ");
        return 0.5*base*height;
    }
}
