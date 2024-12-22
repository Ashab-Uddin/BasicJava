package Encapsulation.problem1;


/* Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables. */
public class EncapsulationTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Ashab Uddin");
        p1.setAge("Fifty");
        p1.setCountry("Bangladesh");

        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Country: "+p1.getCountry());
    }
}
