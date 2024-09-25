package BasicJava;

import java.util.Scanner;

public class FactorialAnumber {
    public static void main(String[] args) {
        int fact = 1; 
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter a number to find its factorial: ");
        int num = s.nextInt();

        
        if (num < 0) {
            System.out.print("Factorial is not defined for this number.");
        } else {
            
            for (int i = 1; i <= num; i++) {
                fact *= i; 
            }
           
            System.out.println(num + " Factorial Value is: " + fact);
        }

        
        s.close();
    }
}
