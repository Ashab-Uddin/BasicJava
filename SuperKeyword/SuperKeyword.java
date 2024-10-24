package SuperKeyword;
//It is used to call super class instance variable
class A{
    //it is super class
    int x = 5;
}
class B extends A{
    //subclass
    int x = 10;
    
    void display(){
        System.out.println("sub class x = "+x);
        System.out.println("super class x = "+super.x);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
