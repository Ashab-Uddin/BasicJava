package practice.Abstraction;

public class test {
    public static void main(String[] args) {
        MobileUser ms;
        ms = new Rohim();
        ms.sendMassage();
        ms = new Korim();
        ms.sendMassage();
    }
}
