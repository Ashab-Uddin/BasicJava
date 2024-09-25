package BasicJava;

import java.util.Scanner;

public class VowelConsonat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch =s.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+"is vowel");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" is consonat");
        }
        else{
            System.out.println("Invalid Input");
        }
        s.close();
    }
}
