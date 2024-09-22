package BasicJava;
import java.util.Scanner;
public class SummationOfFibonacciSquence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int first =0,second =1 ,sum=first+second;

        System.out.print("Enter the Fibonacci term for sum: ");

        int n = s.nextInt();

        for (int i =3;i<=n;i++){
            int next = first +second;
            sum +=next;
            first = second;
            second =next;
        }
        if(n==0){
            System.out.print("Summation: "+first);
        }
        
        else
        System.out.print("Summation: "+sum);
        if(n==1){
            System.out.print("Summation: "+first);
        }

        s.close();

    }
}
