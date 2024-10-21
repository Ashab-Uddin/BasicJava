package array;

public class TwoDArray {  
    public static void main(String[] args){
        int [][]a = {
                    {1, -2, 3},    
                    {-4, -5, 6, 9}, 
                    {7}            
                    };

        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]); 
            }
        }

        System.out.println("Separate............");

        for(int [] innerArray:a){
            for(int data:innerArray){
                System.out.println(data);
            }
        }
    }
}
