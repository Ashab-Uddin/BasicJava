package MethodOverriding;
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("Person Information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
class Teacher extends Person{
    String qualification;

    @Override
    void displayPerson(){
        System.out.println("Teacher Information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Qualification: "+qualification);
    }

}

public class MethodOveriding {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Ashab Uddin";
        p.age = 22;
        p.displayPerson();

        Teacher t = new Teacher();
        t.name = "Anisul Isam";
        t.age = 30;
        t.qualification = "Bsc in CSE at LU";
        t.displayPerson();
    }
}
