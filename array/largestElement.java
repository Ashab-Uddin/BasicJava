package array;

public class largestElement {
    public static void main(String[] args){
        int []ages = {4,3,5,3,6,1,4,-2,-5,-3};
        int length = ages.length;
        int Max = ages[0];

        for(int i=1;i<length;i++){
            if(Max < ages[i]){
                Max = ages[i];
            }
        }
        System.out.println("Max element of this array and at index= "+Max);
        
        
    }
    
}
