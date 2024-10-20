package BasicJava;
import java.util.Scanner;

class SummationFactorialOddNumber {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long sumOddFactorials(int limit) {
        long sum = 0;

        // Loop through odd numbers only
        for (int i = 1; i <= limit; i += 2) {
            sum += factorial(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Upper Limit: ");
        int limit = s.nextInt();

        long result = sumOddFactorials(limit);

        System.out.println("Sum of factorials of odd numbers up to " + limit + " is: " + result);

        s.close();
    }
}
