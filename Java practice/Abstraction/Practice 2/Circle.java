public class Circle extends Shape{
    public Circle(double r){
        super(r,r);
    }

    public void area(){
        double area = Math.PI * dim1 * dim2;
        System.out.println("Area of Triangle: "+area);
    }
}
