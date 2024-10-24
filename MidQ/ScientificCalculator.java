/*
 * Suppose you are developing a Java application for a scientific calculator. You need to create a method that calculates the average of a variable number of test scores. The method should be flexible enough to accept any number of test scores as arguments. Now, write a Java program as per the above scenario.
 */
package MidQ;

class Calculator {
    double avg;

    
    void calc(int... i) {
        int sum = 0; 
        int count = 0;

        for (int x : i) {
            sum += x;
            count++;
        }
        
        if (count > 0) {
            avg = (double) sum / count; 
        }
    }
}

public class ScientificCalculator {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();


        c1.calc(3, 5, 6, 3);
        System.out.println("Average of first calculation: " + c1.avg);

        
        c1.calc(3, 3, 3);
        System.out.println("Average of second calculation: " + c1.avg);
    }
}
