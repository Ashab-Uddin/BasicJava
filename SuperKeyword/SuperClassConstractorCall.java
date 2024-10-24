package SuperKeyword;
class A{
    // super constractor
    A(){
        System.out.println("A is super constractor");
    }
    
}
class B extends A{
    //sub constractor
    
    B(){
        System.out.println("B is sub constractor");
    }
    
    

}

public class SuperClassConstractorCall {
    public static void main(String[] args) {
        B b = new B();
        
    
    }
}
