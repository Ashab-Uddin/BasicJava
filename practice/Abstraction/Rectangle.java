package practice.Abstraction;

public class Rectangle extends Shape {
    double dim1,dim2;
    
    Rectangle(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    void area(){
        double result = dim1*dim2;
        System.out.println("Area of Rectangle: "+result);
    }
}
