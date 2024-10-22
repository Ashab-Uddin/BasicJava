package array;
import java.util.Scanner;

public class matrixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] A = new int[2][3];
        int [][] B = new int[2][3];
        int [][] R = new int[2][3];


        System.out.println("Enter the elements of A matrix: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = s.nextInt();
            }
        }


        System.out.println("Enter the elements of B matrix: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.printf("B[%d][%d] = ", row, col);
                B[row][col] = s.nextInt(); 
            }
        }


        System.out.println("Entered A matrix: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }


        System.out.println("Entered B matrix: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(B[row][col] + " "); 
            }
            System.out.println();
        }

        System.out.println("Sum of matrix A and B: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                //R[row][col] = A[row][col] + B[row][col];  
                //System.out.print(" " + R[row][col] );  
                System.out.print(" " + (A[row][col] + B[row][col]) );  
            }
            System.out.println();
        }

        s.close();
    }
}
