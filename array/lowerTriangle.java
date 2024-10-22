package array;

public class lowerTriangle {
    public static void main(String[] args) {
        int [][]lowerTriangleM = matrixUtility.inputMatrix();
        int n = lowerTriangleM.length;

        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(lowerTriangleM[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
