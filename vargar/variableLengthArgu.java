package vargar;
class variableLengthArgument{
    void add(int ... nums){
        int sum = 0;
        for(int x:nums){
            sum +=x;
        }
        System.out.println(sum);
    }
}

public class variableLengthArgu {
    public static void main(String[] args) {
        variableLengthArgument obj = new variableLengthArgument();
        obj.add(10,20);
        obj.add(10,30,40,5);
        obj.add(50,40,90);
    }
}
