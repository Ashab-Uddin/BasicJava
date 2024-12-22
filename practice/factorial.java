package practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        factc facto = new factc();
        int result = facto.fact(n);
        System.out.println("Factorial of "+n +" is: " +result);
        s.close();
    }
}
