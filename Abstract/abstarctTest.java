package Abstract;
abstract class MobileUser{
    abstract void sendMeassage();
}
class Rohim extends MobileUser{
    @Override
    void sendMeassage(){
        System.out.println("Hi, I am Rohim");
    }
}
class Korim extends MobileUser{
    @Override
    void sendMeassage(){
        System.out.println("Hi, I am Korim");
    }
}

public class abstarctTest {
    public static void main(String[] args) {
        MobileUser ms;
        ms = new Rohim();
        ms.sendMeassage();

        ms = new Korim();
        ms.sendMeassage();
    }
}
