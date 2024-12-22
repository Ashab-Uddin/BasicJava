package practice.Abstraction;

public class Circle extends Shape{
    double dim1;
    Circle(double dim1){
        this.dim1 = dim1;
    }
    void area(){
        double result = 3.1416*dim1*dim1;
        System.out.println("Area of Circle: "+result);
    }
}
