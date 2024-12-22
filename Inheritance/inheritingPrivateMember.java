package Inheritance;

class Personw {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}

class Teacherw extends Personw {
    private String qualification;


    void setQualification(String qualification) {
        this.qualification = qualification;
    }

    String getQualification() {
        return qualification;
    }
}

public class inheritingPrivateMember {
    public static void main(String[] args) {
        Teacherw t = new Teacherw();
        t.setName("Ashab Uddin");
        t.setAge(22);
        t.setQualification("Running Bsc in GUB");

        
        System.out.println("Name: " + t.getName());
        System.out.println("Age: " + t.getAge());
        System.out.println("Qualification: " + t.getQualification());  
    }
}
