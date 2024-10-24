package SuperKeyword;

class Aha {
    void displayc() {
        System.out.println("Inside Class A");
    }
}

class Bha extends Aha {
    @Override
    void displayc() {
        // No call to super.displayc(), so only "Inside Class B" will be printed
        super.displayc();
        System.out.println("Inside Class B");
    }
}

public class SuperClassMethodCall {
    public static void main(String[] args) {
        Bha b = new Bha();
        b.displayc(); 
    }
}
