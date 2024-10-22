package loop;

public class forEach {
    public static void main(String[] args) {
        String[] names = {"ashab","uddin","ibrahim","modo","topu"};
        for(String x:names){
            System.out.println(x);
        }
        System.out.println("Length of the array is: "+names.length);
    }
}
