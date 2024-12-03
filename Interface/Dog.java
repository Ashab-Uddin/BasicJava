package Interface;

public class Dog implements Animal  {

    public void eat(){
        System.out.println("The Dog is Black Color");
    }
}

class introduction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}