package practice;

import java.util.Scanner;

public class weekDays {
    public static void main(String[] args) {

        String[] days = {"Satarday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.print("Enter the number(1-7): ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num == 1){
            System.out.println(days[0]);
        }
        else if(num==2){
            System.out.println(days[1]);
        }
        else if(num==3){
            System.out.println(days[2]);
        }
        else if(num==4){
            System.out.println(days[3]);
        }
        else if(num==5){
            System.out.println(days[4]);
        }
        else if(num==6){
            System.out.println(days[5]);
        }
        else if(num==7){
            System.out.println(days[6]);
        }
        else{
            System.out.println("invalid input,Please enter number 1 to 7");
        }
        s.close();
    }
}
