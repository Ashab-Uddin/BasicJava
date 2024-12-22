package practice.Encapsulation.problem2;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
        return 3.1416*radius*radius;
    }
    double calculatePerimeter(){
        return 2*3.1416*radius;
    }
}
