package practice.Abstraction;

public class Triangle extends Shape {
    double dim1,dim2;
    public Triangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    void area(){
        double result= 0.5*dim1*dim2;
        System.out.println("Area of Triangle: "+result);
    }
}
