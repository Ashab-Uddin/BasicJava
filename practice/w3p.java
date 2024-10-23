package practice;

class Persons {
    String name;
    double age;

    Persons(String n, double ag) {
        name = n;
        age = ag;
    }

    void displayinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println(); 
    }
}

public class w3p {
    public static void main(String[] args) {
        Persons person1 = new Persons("Ashab", 22.4);
        person1.displayinfo();  

        Persons person2 = new Persons("Modabbir", 23.5);
        person2.displayinfo();  
    }
}
