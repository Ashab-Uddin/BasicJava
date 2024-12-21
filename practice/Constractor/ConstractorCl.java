package practice.Constractor;

public class ConstractorCl {
    String name,dept,gender;
    int id;
    ConstractorCl(String name, String dept, String gender,int id){
        this.name = name;
        this.dept = dept;
        this.gender = gender;
        this.id = id;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Dept: "+dept);
        System.out.println("Gender: "+gender);
        System.out.println("Id: "+id);
    }
}
