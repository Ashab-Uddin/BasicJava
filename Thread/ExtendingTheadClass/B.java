package ExtendingTheadClass;
public class B {
    public static void main(String[] args) throws InterruptedException {
        A t = new A();
        t.start();
        for(int i = 0;i<=10;i++){
            System.out.println("Imran");
            Thread.sleep(1000);
        }
        
    }
}
