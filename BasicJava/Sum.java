// package BasicJava;

// import java.util.Scanner;

// public class Sum {
//     public static void main(String[] args) {
//         int num1,num2,result;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter num1: ");
//         num1 = s.nextInt();
//         System.out.print("Enter num2: ");
//         num2 = s.nextInt();
//         result =num1+num2;
//         System.out.print("Sum of the number: "+result);
//         s.close();



//     }
// }
package BasicJava;
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        

        System.out.print("Enter num1: ");
      int  num1 =s.nextInt();

        System.out.print("Enter num2: ");
      int  num2= s.nextInt();

    int    result = num1+num2;

        System.out.print("The sum of number: "+result);
        s.close();

    } 
}