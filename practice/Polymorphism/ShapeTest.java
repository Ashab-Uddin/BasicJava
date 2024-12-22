package practice.Polymorphism;

public class ShapeTest {
    public static void main(String[] args) {
        // Shape s = new Shape();
        Triangle t = new Triangle(30, 60);
        Rectangle r = new Rectangle(30, 60);
        System.out.println(t.area());
        System.out.println(r.area());
        
    }
}
