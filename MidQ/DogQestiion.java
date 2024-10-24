/*
 * "Create a Java program to create a class called Dog with a name and breed (String) attributes. Create two instances of the Dog class, set their attributes using the constructor, modify the attributes using the setter methods, and print the updated values."
 */
package MidQ;
class Dog{
    private String name;
    private String breed;

    Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setbreed(String breed){
        this.breed = breed;
    }

    String getbreed(){
        return breed;
    }
    void display(){
        System.out.println("Initial Dog information");
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
    }


}

public class DogQestiion {
    public static void main(String[] args) {
        Dog d1 = new Dog("dogi", "brammon");
        d1.display();

        d1.setName("ponki");
        d1.setbreed("china");
        d1.display();

    }
}
