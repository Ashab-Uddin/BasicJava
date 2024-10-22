package array;

public class lowerTriangle {
    public static void main(String[] args) {
        int [][]lowerTriangleM = matrixUtility.inputMatrix();
        int n = lowerTriangleM.length;
        int sumOfLowerTriangleM = 0;

        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(lowerTriangleM[row][col]+ " ");
            }
            System.out.println();
        }

        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                if(row>col){
                    sumOfLowerTriangleM += lowerTriangleM[row][col];
                }
            }
        }

        System.out.println("Sum of the lower triangle matrix: "+sumOfLowerTriangleM);
    }
}
