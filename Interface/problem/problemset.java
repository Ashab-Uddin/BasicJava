/*Write a Java program to create an interface Shape1 with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape1 interface. Implement the getArea() method for each of the three classes. */
package Interface.problem;



class Rectangle implements Shape1{
    private double length;
    private double width;
    private double r1;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        // r1 = 0;

    }
    public void getArea(){
        r1 = length*width;
        System.out.println("Area of Rectange: "+r1);
    }
}
class Circle implements Shape1{
    private double radius;
        private double r2;
    
        
    public Circle(double radius){
        this.radius = radius;
    }
    public void getArea(){
        r2 = Math.PI*radius*radius;
        System.out.println("Area of Circle: "+r2);
    }

    }
class Triangle implements Shape1{
    private double base;
    private double height;
    private double r3;
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public void getArea(){
        r3 = 0.5*base*height;
        System.out.println("Area of Triangle: "+r3);
    }
}
public class problemset{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 12);
        r.getArea();

        Circle c = new Circle(3);
        c.getArea();

        Triangle t = new Triangle(4, 6);
        t.getArea();
    }
}

