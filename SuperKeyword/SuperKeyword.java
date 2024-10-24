package SuperKeyword;
class A{
    //it is super class
    int x = 5;
}
class B extends A{
    int x = 10;
    
    void display(){
        System.out.println("main class x = "+x);
        System.out.println("super class x = "+super.x);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
