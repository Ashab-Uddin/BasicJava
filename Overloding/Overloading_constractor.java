package Overloding;
class Student{
    String name, dept,religion;
    int id,phone;

    Student(){
        System.out.println("There is no information");
    }

    Student(String n,String d,String reli){
        name = n;
        dept = d;
        religion = reli;
    }

    Student(String n, String d, String reli, int i,int ph){
        name = n;
        dept = d;
        religion = reli;
        id = i;
        phone = ph;

    }
    void displayinfo(){
        System.out.println("Student Informantion");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Religion: "+religion);
        System.out.println("Student ID: "+id);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}

public class Overloading_constractor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayinfo();

        Student student2 = new Student("Ashab Uddin","CSE","Islam");
        student2.displayinfo();

        Student student3 = new Student("Imran Hossen","EEE","Islam", 232001084,134544);
        student3.displayinfo();
    }
}
