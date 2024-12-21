package problem;

import java.util.Scanner;

public class AmonstrangNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int a,sum =0;
        while (n != 0) {
            a = n%10;
            sum = sum+a*a*a;
            n = n/10;
        }
        if(num == sum){
            System.out.println("Amonstrag Number");
        }
        else{
            System.out.println("Not Amonstrag Number");
        }
        s.close();
    }
}
