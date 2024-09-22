package BasicJava;
import java.util.Scanner;

public class Input {  // Changed 'input' to 'Input'

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;
        System.out.print("Enter any number: ");
        num1 = s.nextInt();
        System.out.println("You Entered:" +num1);
        s.close();

    }
}
