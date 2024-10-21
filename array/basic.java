package array;

public class basic {
    public static void main(String [] args){
        //int[] age = new int[5];
        int []ages = {4,3,5,3,6,1,4};
        int length = ages.length;
        int sum =0;

        for(int i=0;i<length;i++){
            sum = sum+ages[i];
        }
        System.out.println("Sum of an array: "+sum);
        float avg = (float)sum/length;
        System.out.println("Averge of length: "+avg);


    }
}
