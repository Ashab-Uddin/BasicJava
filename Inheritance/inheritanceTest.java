package Inheritance;
class Person{
    String name;
    int age;

    void displayinfo1(){
        System.out.println("Student information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    String qualification;
    void displayinfo2() {
        displayinfo1();
        System.out.println("Qualification: "+qualification);
    }
}

public class inheritanceTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name ="Ashab Uddin";
        t.age = 22;
        t.qualification = "Runnig Bsc in CSE at GUB";

        t.displayinfo2();
    }
}
