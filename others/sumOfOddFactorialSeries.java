import java.util.Scanner;  

public class sumOfOddFactorialSeries {

    // Method to calculate factorial of a number
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate the summation of the odd factorial series
    public static double calculateSum(double x, int n) {
        double sum = 0.0;

        // Loop through odd numbers only and calculate the sum
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += Math.pow(x, i) / factorial(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  

        System.out.print("Enter the value of x: ");
        double x = s.nextDouble();  // Read the value of x from the user
        
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();  

        double result = calculateSum(x, n);  
        System.out.println("The result of the summation is: " + result);  
        
        s.close();  
    }
}
