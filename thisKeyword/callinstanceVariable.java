package thisKeyword;
class person{
    String name,hairColor;
    int age;
    

    person(String name,int age){
        this.name = name;
        this.age = age;

    }
    person(String name ,int age, String hairColor){
        this(name,age);
        this.hairColor = hairColor;
    }
    
    void displayPerson(){
        System.out.println("Person Information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Hair Color: "+hairColor);
    }
}

public class callinstanceVariable {
    public static void main(String[] args) {
        person p1 = new person("Ashab Uddin",  22);
        p1.displayPerson();

        person p2 = new person("Imran", 24,"red");
        p2.displayPerson();
    }
}
