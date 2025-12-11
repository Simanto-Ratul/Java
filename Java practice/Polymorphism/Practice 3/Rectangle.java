public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        System.out.print("Area for rectangle : ");
        return length * width;
    }
}
