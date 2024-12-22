package practice.Polymorphism;

public class Triangle {
    double base,height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        System.out.print("Area of Triangle: ");
        return 0.5*base*height;
    }

}
