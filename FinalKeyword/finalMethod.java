package FinalKeyword;

class University {
    // This method is final, so it cannot be overridden in the subclass
    final void display() {
        System.out.println("University info");
    }
}

class Student extends University {
    // This is a separate method specific to the Student class
    void display2() {
        System.out.println("Student info");
    }
}

public class finalMethod {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // Calling the final method from the parent class
        s1.display();  // Prints "University info"
        
        // Calling the method specific to the Student class
        s1.display2(); // Prints "Student info"
    }
}
