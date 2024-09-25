package BasicJava;
import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Variable to store the score
        int score = -1;

        // Taking input from the user and handling invalid inputs
        System.out.print("Enter the score (0-100): ");

        // Check if the input is an integer
        if (s.hasNextInt()) {
            score = s.nextInt();

            // Validate if the score is within the valid range
            if (score < 0 || score > 100) {
                System.out.println("Invalid input! Please enter a value between 0 and 100.");
            } else {
                // Determining the grade based on the score
                String grade;
                if (score == 100) {
                    grade = "A+";
                } else if (score >= 80) {
                    grade = "A+";
                } else if (score >= 70) {
                    grade = "A";
                } else if (score >= 60) {
                    grade = "A-";
                } else if (score >= 50) {
                    grade = "B";
                } else if (score >= 40) {
                    grade = "C";
                } else if (score >= 33) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                // Displaying the grade
                System.out.println("The grade for the score " + score + " is: " + grade);
            }
        } else {
            // If input is not an integer
            System.out.println("Invalid input! Please enter a valid integer value.");
        }

        // Close the scanner
        s.close();
    }
}
