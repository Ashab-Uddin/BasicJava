package Recursion;
class factorialN{
    int fact(int n){
        if(n ==1){
            return 1;
        }
        else{
            return  n *fact(n-1);
        }
    }
}

public class factorialNumber {
    public static void main(String[] args) {
        factorialN obj = new factorialN();
        int r = obj.fact(5);
        System.out.println("result: "+r);
    }
    
}
