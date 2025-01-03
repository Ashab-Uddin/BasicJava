package ExtendingTheadClass;
public class A extends Thread {
    
    @Override
    public void run(){
        try{
            for(int i = 0;i<=10;i++){
                System.out.println("Ashab Uddin");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            
        }
    }
}
