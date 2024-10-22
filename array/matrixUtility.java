package array;
import java.util.Scanner;

public class matrixUtility {
    public static  int[][] input2Darray1(Scanner s) {
        System.out.print("Enter the row of 1st matrix: ");
        int row = s.nextInt();

        System.out.print("Enter the col of 1st matrix: ");
        int col = s.nextInt();

        int[][]matArray1 = new int[row][col];

        for(int i = 0;i<row;i++){
            for(int j = 0; j<col; j++){
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matArray1[i][j] = s.nextInt();
            }
        }
        s.close();
        return matArray1;

    }
}
