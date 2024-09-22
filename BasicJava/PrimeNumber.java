package BasicJava;
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        
        System.out.print("Enter your checked number: ");
        int num = s.nextInt();
        int count = 0;
        
        for(int i =2;i<num;i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
 
        if( count == 0){
            System.out.printf("%d is a Prime Number",num);
        }
        else
        System.out.printf(" %d in Not a Prmie Numer",num);

        s.close();
    }
}