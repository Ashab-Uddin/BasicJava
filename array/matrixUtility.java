package array;
import java.util.Scanner;

public class matrixUtility {
    public static int[][][] input2DArrays() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the rowA of A matrix: ");
        int rowA = s.nextInt();
        System.out.println("Enter the colA of A matrix: ");
        int colA = s.nextInt();

        System.out.println("Enter the rowB of A matrix: ");
        int rowB = s.nextInt();
        System.out.println("Enter the colB of A matrix: ");
        int colB = s.nextInt();

        int [][] A = new int[rowA][colA];
        int [][] B = new int[rowB][colB];


        System.out.println("Enter the elements of A matrix: ");
        for(int row = 0; row < rowA; row++){
            for(int col = 0; col < colA; col++){
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = s.nextInt();
            }
        }


        System.out.println("Enter the elements of B matrix: ");
        for(int row = 0; row < rowB; row++){
            for(int col = 0; col < colB; col++){
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = s.nextInt(); 
            }
        }


        System.out.println("Entered A matrix: ");
        for(int row = 0; row < rowA; row++){
            for(int col = 0; col < colA; col++){
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }


        System.out.println("Entered B matrix: ");
        for(int row = 0; row < rowB; row++){
            for(int col = 0; col < colB; col++){
                System.out.print(B[row][col] + " "); 
            }
            System.out.println();
        }
        s.close();
    }
}
