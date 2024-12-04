package Exception;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int x = 20;
            // int y = 2;
            int y = 0;
            int r = x/y;
            System.out.println("Result: "+r);
        }
        catch(ArithmeticException e){
            System.out.println(" "+e);
        }
        finally{
            System.out.println("Last line is Exicuted");
        }
    }
}
