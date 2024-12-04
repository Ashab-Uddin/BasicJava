package Exception;
import java.util.Scanner;
public class exception {
    public static void main(String[] args) {
        try{
            float a,b;
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            b = s.nextInt();
            s.close();
            float div = a/b;
            System.out.println("Devision: "+div);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception found: "+e.getMessage());
        }
        finally {
            System.out.println("Final.");
    }
}
} 
