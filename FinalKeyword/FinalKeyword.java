package FinalKeyword;
class University{
    final String UNIVERSITY_NAME = "GUB";//final variable
    final int fees;//blank final variable
    static final int semester;//static blank final variable;

    //blank final variable is must initialize the constractor.
    University(){
        fees = 20000;
        

    }
    //static blank final variable is must initialize the static block
    static{
        semester = 8;
    }
    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
        System.out.println(semester);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        University p = new University();
        p.display();
    }
}
