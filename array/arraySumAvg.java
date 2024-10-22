package array;

public class arraySumAvg {
    public static void main(String[] args){
        int[] numArray = arrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the numbers is: "+sum);
        System.out.println("Average of the numbers: "+avg);
    }
    public static long sum(int []numArray){
        int sum = 0;
        for(int i =0;i<numArray.length;i++){
            sum +=numArray[i];
        }
        return sum;
    }
    public static int average(int []numArray){
        long sum = sum(numArray);
        return (int)sum/numArray.length;
    }
}
