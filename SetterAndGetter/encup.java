package SetterAndGetter;
class encupsulation{
    private String name;
    private double age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void setAge(double age){
        this.age = age;
    }
    public double getAge(){
        return age;
    }
}

public class encup {
    public static void main(String[] args) {
        encupsulation person1 = new encupsulation();
        person1.setName("Ashab Uddin");
        System.out.println(person1.getName());
        person1.setAge(22.9);
        System.out.println(person1.getAge());
        
    }
}
