//wap for perfactly divide a number is another number
package Exception;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        try{
            int num1,num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = s.nextInt();
        System.out.println("Enter num2: ");
        num2 = s.nextInt();
        s.close();
        int r = num1/num2;
        System.out.println("Result is: "+r);

        }
        catch(ArithmeticException e){
            System.out.println("Exception is found: "+e.getMessage());
        }
        
        // finally{

        // }
        
    }
}
