package Polymorhism;
class Person{
    void display(){
        System.out.println("I am person");
    }
}
class Teacher extends Person{
    void display(){
        System.out.println("I am Teacher");
    }
}
class Student extends Person{
    void display(){
        System.out.println("I am student");
    }
}

public class polyTest {
    public static void main(String[] args) {
       /*  Person p = new Person();
        p.display();

        Teacher t = new Teacher();
        t.display();

        Student s = new Student();
        s.display();
        */
        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();

    }
}
