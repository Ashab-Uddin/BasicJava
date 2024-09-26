

package BasicJava;

import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();

        // Declare an array to store the elements
        int[] numbers = new int[n];

        // Input elements from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = s.nextInt();
        }

        // Assume the first element is the largest
        int largest = numbers[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];  // Update the largest value if found a bigger number
            }
        }

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);

        // Close the scanner
        s.close();
    }
}
 