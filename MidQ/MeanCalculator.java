package MidQ;

public class MeanCalculator {
    
    // Method to calculate mean for an array of integers
    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    // Method to calculate mean for an array of doubles
    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // Method to calculate mean for an array of floats
    public static float calculateMean(float[] numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Test case for integer array
        int[] intNumbers = {1, 2, 3, 4, 5};
        System.out.println("Mean of int array: " + calculateMean(intNumbers));
        
        // Test case for double array
        double[] doubleNumbers = {1.5, 2.5, 3.5, 4.5};
        System.out.println("Mean of double array: " + calculateMean(doubleNumbers));

        // Test case for float array
        float[] floatNumbers = {1.5f, 2.5f, 3.5f, 4.5f};
        System.out.println("Mean of float array: " + calculateMean(floatNumbers));
    }
}
