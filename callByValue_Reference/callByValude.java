package callByValue_Reference;
class callByValueT{

    void change(int i){
        i = 20;
    }
}

public class callByValude {
    public static void main(String[] args) {
        callByValueT ob1 = new callByValueT();
        int x = 10;
        System.out.println("Before Calling: "+x);

        ob1.change(x);
        System.out.println("After Calling: "+x);

    }

}
