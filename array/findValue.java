package array;
import java.util.Scanner;

public class findValue {
    public static void main(String[] args){
        int []array ={2,4,5,6,3,6,3,6,234,65,24,45,34,12};

        System.out.print("Enter the searching value: ");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();

        int found = 0;

        for(int i=0;i<array.length;i++){
            if(value == array[i]){
                System.out.println("Item is found at index "+i);
                found= 1;
                break;
            }

        }
        
        if(found == 0){
            System.out.println("Item is not found");
        }
        s.close();
    }
}
