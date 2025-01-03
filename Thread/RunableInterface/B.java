package RunableInterface;

public class B {
    public static void main(String[] args) {
        A r = new A();

        Thread t = new Thread(r);
        t.start();
        for(int i = 0;i<= 10;i++){
            System.out.println("Main thread");
        }
    }
}
