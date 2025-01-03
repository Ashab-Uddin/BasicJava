package ExtendingTheadClass;
public class A extends Thread {
    
    @Override
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("Ashab Uddin");
        }
    }
}
