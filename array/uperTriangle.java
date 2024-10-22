package array;

public class uperTriangle {
    public static void main(String[] args) {
        int [][]uperTriangle = matrixUtility.inputMatrix();
        int n = uperTriangle.length;

        System.out.println("Entered Matrix: ");
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(uperTriangle[row][col]+" ");
            }
            System.out.println();
        }
    }
}
