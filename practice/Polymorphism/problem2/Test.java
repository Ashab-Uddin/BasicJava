package practice.Polymorphism.problem2;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();
        p = new Student();
        p.display();
        p = new Teacher();
        p.display();
    }
}
