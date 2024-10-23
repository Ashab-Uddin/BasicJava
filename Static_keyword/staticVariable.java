package Static_keyword;
class staticVariableTest{
    static String universityName = "Green University of Bangladesh";
}

public class staticVariable {
    public static void main(String[] args) {
        // staticVariableTest obj = new staticVariableTest(); in use static variable doesn't create object.
        // we are directly acces this variable with class name.. here is a example
        System.out.println("University Name: "+staticVariableTest.universityName);
    }
}
