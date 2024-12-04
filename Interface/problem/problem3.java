/*Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes. */
package Interface.problem;

class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Spacecraf flying");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Airplane is Flying");
    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Helicopter is Flying");
    }
}

public class problem3 {
    public static void main(String[] args){
        Spacecraft s = new Spacecraft();
        s.fly_obj();

        Airplane a = new Airplane();
        a.fly_obj();

        Helicopter h = new Helicopter();
        h.fly_obj();
    }
}
