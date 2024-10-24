package SuperKeyword;
class Vehicle{
    String Color;
    double weight;

    Vehicle(String c, double w){
            Color = c;
            weight = w;

    }
    void attributdisplay(){
        System.out.println("Color: "+Color);
        System.out.println("Weight: "+weight);
    }
}
class car extends Vehicle{
    int gear;

    car(String c, double w,int g){
        super(c,w);
        gear = g;
    }
    @Override
    void attributdisplay(){
        super.attributdisplay();
        System.out.println("Gear: "+gear);
    }
}

public class superkUes {
    public static void main(String[] args) {
        car  c1 = new car("Yellow", 4500.88, 5);
        c1.attributdisplay();
    }
}
