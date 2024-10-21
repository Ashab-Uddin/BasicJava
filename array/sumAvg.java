package array;

public class sumAvg {
    public static void main(String[] args){
        int []ages = {4,3,5,3,6,1,4,-2,-5,-3};
        int length = ages.length;
        int sum =0;
        double avg;

        for(int i=0;i<length;i++){
            sum = sum+ages[i];
        }
        System.out.println("Sum = "+sum);
        avg = (double)sum/length;
        System.out.println("Average = "+avg);
    }
}
