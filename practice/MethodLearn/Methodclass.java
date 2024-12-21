package practice.MethodLearn;

public class Methodclass {
    String name,dept,gender;
    int id,age;
    void method(String name, String dept, String gender, int id, int age){
        this.name = name;
        this.dept = dept;
        this.gender = gender;
        this.id = id;
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Dept: "+dept);
        System.out.println("Gender: "+gender);
        System.out.println("Id: "+id);
        System.out.println("Age: "+age);
    }
}
