package Exception;
import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Check if the age is greater than 25
            if (age > 25) {
                throw new AgeOutOfRangeException(age); // Throw custom exception
            }

            System.out.println("You are within the requested age limit!");
        } catch (AgeOutOfRangeException e) {
            // Catch and print the custom exception message
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
