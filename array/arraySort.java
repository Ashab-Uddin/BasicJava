package array;
// import java.util.Scanner;
import java.util.Arrays;

public class arraySort {
public static void main(String[] args) {
    int []arraySort = arrayUtility.inputArray();
    //int []arraySort = {3,5,756,45,23,4,65,23,1,43};
    Arrays.sort(arraySort);

    System.out.println("Sorted Array: ");
    for(int i = 0;i<arraySort.length; i++){
        System.out.print(" "+arraySort[i]);
    }
}
}
