package thisKeyword;
class person{
    String name;
    int age;

    person(String name,int age){
        this.name = name;
        this.age = age;

    }
    
    void displayPerson(){
        System.out.println("Person Information");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class callinstanceVariable {
    public static void main(String[] args) {
        person p = new person("Ashab Uddin",  22);
        p.displayPerson();
    }
}
