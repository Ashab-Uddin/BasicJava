package callByValue_Reference;
class callByReference{
    String name;
    void change(callByReference r2){
        r2.name ="Ashab";
    }

}

public class callByReferenceTest {
    public static void main(String[] args) {
        callByReference r1 = new callByReference();
        r1.name = "Sohel";
        System.out.println("Before Calling: "+r1.name);

        r1.change(r1);
        
        System.out.println("After Calling: "+r1.name);
    }
}
