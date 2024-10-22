package array;

import java.util.Scanner;

public class diagonal {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int [][] A = new int[3][3];
    int sumOfDiagonal = 0;

    System.out.println("Enter the elements of A matrix: ");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.printf("A[%d][%d] = ", row, col);
                A[row][col] = s.nextInt();
            }
        }


        System.out.println("Entered A matrix: ");
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }

        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                if(row == col){
                    sumOfDiagonal += A[row][col];
                }
            }
        }

        System.out.println("Sum of the Diagonal of A matrix: "+sumOfDiagonal);



        s.close();

}
}
