/*
 * Write a java function called Write a Python function called average that accepts a variable 
number of arguments and returns the average of those arguments. If no arguments are provided, the function should return 0. that accepts a variable number of arguments and returns the average of those arguments. If no arguments are provided, the function should 
return 0.
 */
package practice;
public class AverageCalculator {
    
    // Method to calculate average with a variable number of arguments
    public static double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        
        // Test cases
        System.out.println("Average of 10, 20, 30: " + average(10, 20, 30));  
        System.out.println("Average of 5, 15: " + average(5, 15));           
        System.out.println("Average with no arguments: " + average());        
    }
}
