package array;
import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        int[][] mats1 = matrixUtility.input2Darray1(s);  

        System.out.println("Your Entered 1st Matrix:");
        for (int i = 0; i < mats1.length; i++) {
            for (int j = 0; j < mats1[i].length; j++) {
                System.out.print(mats1[i][j] + " ");
            }
            System.out.println();
        }

        s.close(); 
    }
}
