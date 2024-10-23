package StaticMethod;
class staticMethodTest{
    void display1(){
        System.out.println("I am not staic Method");
    }
    static void display2(){
        System.out.println("I am Static method");
    }
}


public class staticMethod {
    public static void main(String[] args) {
        staticMethodTest obj = new staticMethodTest();
        obj.display1();

        staticMethodTest.display2();
    }
}
