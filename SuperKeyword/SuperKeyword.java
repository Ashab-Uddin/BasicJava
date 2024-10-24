package SuperKeyword;
class A{
    int x = 5;
}
class B extends A{
    int x = 10;
    
    void display(){
        System.out.println(x);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
