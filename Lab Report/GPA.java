import java.util.Scanner;

class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException(int age) {
        super("You are older than the requested age (25 years), you are " + age + "!!!");
    }
}

class LowGpaException extends Exception {
    public LowGpaException() {
        super("Your GPA is not sufficient to apply for this job (2.5)");
    }
}

public class GPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age > 25) {
                throw new AgeOutOfRangeException(age);
            }
        } catch (AgeOutOfRangeException e) {
            System.out.println(e.getMessage());
            return; 
        }

        try {
            
            System.out.print("Enter your GPA: ");
            double gpa = scanner.nextDouble();
            if (gpa < 2.5) {
                throw new LowGpaException();
            }
        } catch (LowGpaException e) {
            System.out.println(e.getMessage());
            return; 
        }
        
        System.out.println("Your application is accepted and is under study.");
        
    }
    
}
