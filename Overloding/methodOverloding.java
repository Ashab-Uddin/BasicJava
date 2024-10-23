package Overloding;
class Overload{
    int a,b,c;

    void sum(){
        System.out.println("There is no value");
    }
    void sum(int a,int b){
        System.out.println("a+b= "+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("a+b+c = "+(a+b+c));
    }
}

public class methodOverloding {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.sum();
        obj.sum(2,3);
        obj.sum(2,4,5);
    }
}
