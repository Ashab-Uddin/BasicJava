/*Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables. */
package practice.Encapsulation.problem1;

public class test {
    public static void main(String[] args) {
        person p = new person();
        p.setName("Ashab Uddin");
        p.setAge(22);
        p.setCountry("Bangladesh");

        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Nationality: "+p.getCountry());
    }
}
