package BasicJava;
import java.util.Scanner;
public class FibonacciSequence {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    int first =0, second =1;
    
    System.out.print("Enter the term of this series: ");
    int n =s.nextInt();

    for(int i =1;i<=n;i++){
        System.out.print(first +" ");

        int next =first+second;
        first =second;
        second =next;

    }
    s.close();

    }

}
