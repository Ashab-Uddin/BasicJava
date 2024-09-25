package BasicJava;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int num;
        System.out.print("Enter a number: ");
        num = s.nextInt();

        if(num%2 == 0)
        {
            System.out.printf("%d is Even Number.",num);
        }
        else
        {
            System.out.printf("%d is Odd Number.",num);
        }
        s.close();
    }
    
}
