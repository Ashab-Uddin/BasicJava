package BasicJava;

import java.util.Scanner;

public class Odd1toN {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        for(int i=1;i<=num;i+=2){
            System.out.println(i);
        }
        s.close();
    }
}
