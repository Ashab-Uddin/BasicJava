package problem;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a,sum = 0;
        while(n != 0){
            a = n%10;
            sum =sum*10+ a;
            n = n/10;
        }
        System.out.println(sum+" ");
        s.close();
    }
}
