package practice.superKeyword;

public class supB extends supA {
    int x = 5;

    void display(){
        super.display();
        System.out.println(super.x);
    }
}
