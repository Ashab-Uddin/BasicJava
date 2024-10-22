package array;
import java.util.Scanner;

public class matrixUtility {
    public static int[][][] input2DArrays(Scanner s) {
        // Input 1st matrix
        System.out.print("Enter the row of 1st matrix: ");
        int row1 = s.nextInt();
        System.out.print("Enter the col of 1st matrix: ");
        int col1 = s.nextInt();
        int[][] matArray1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matArray1[i][j] = s.nextInt();
            }
        }

        // Input 2nd matrix
        System.out.print("Enter the row of 2nd matrix: ");
        int row2 = s.nextInt();
        System.out.print("Enter the col of 2nd matrix: ");
        int col2 = s.nextInt();
        int[][] matArray2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matArray2[i][j] = s.nextInt();
            }
        }

        // Return both matrices as a 3D array
        return new int[][][]{matArray1, matArray2};
    }
}
