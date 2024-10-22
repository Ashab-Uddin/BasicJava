package array;
import java.util.Scanner;

public class matrixUtility {
    

    public static int[][] inputMatrix() {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter the size of the matrix (n x n): ");
        int n = s.nextInt();


        int[][] matrix = new int[n][n];


        System.out.println("Enter the elements of the " + n + "x" + n + " matrix:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("Element at [%d][%d]: ", row, col);
                matrix[row][col] = s.nextInt();
            }
        }

        s.close();
        return matrix; 
    }
}
