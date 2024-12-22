package practice.Polymorphism.problem1;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(30, 60);
        Rectangle r = new Rectangle(30, 60);
        System.out.println(t.area());
        System.out.println(r.area());
        
        
    }
}
