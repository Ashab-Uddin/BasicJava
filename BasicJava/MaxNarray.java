package BasicJava;

import java.util.Scanner;

public class MaxNarray {
    public static void main(String[] args){
        Scanner s =new Scanner (System.in);
        
        System.out.print("Enter the size of array: ");
        int n =s.nextInt();
        int [] numbers = new int [n];

        System.out.print("Enter the "+n+" numbers: ");
        for(int i =0;i<n;i++){
            numbers[i] =s.nextInt();
        }
        int sum =0;
        for(int i =0;i<n;i++){
            sum =sum+numbers[i];
        }
        System.out.println("Sum of this number: "+sum);
        double averge = (double)sum/n;
        System.out.println("Average this number: "+averge);

        s.close();
    }
}
