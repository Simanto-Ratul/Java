public class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public void area(){
        double area = 0.5*dim1*dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
