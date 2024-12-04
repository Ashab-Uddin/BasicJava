/*Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking". */

package Interface.problem;
class Dog implements Animals{
    public void bark(){
        System.out.println("Dog is barking");
    }
}



public class problem2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
