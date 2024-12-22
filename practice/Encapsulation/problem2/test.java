/*Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value. */

package practice.Encapsulation.problem2;


public class test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(6);
        double area = c.calculateArea();
        double perimeter = c.calculatePerimeter();
        System.out.println(" Area: "+area);
        System.out.println("Premeter: "+perimeter);
    }
}
