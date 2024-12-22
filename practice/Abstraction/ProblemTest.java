package practice.Abstraction;

public class ProblemTest {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle(20, 30);
        
        s.area();
        s= new Triangle(20, 30);
        s.area();
        
        s = new Circle(20);
        s.area();
    }
}
