package Static_keyword;
class Student{
    String name;
    int id;
    static String universityName = "GUB";

    Student(String n,int i){
        name = n;
        id = i;
    }

    void displayinfo(){
        System.out.println("Student Informantion");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
        System.out.println();
    }
}



public class static_keyword {
    public static void main(String[] args) {
        
        Student student1 = new Student("Ashab Uddin", 232002274);
        student1.displayinfo();
        Student student2 = new Student("Imran", 232002275);
        student2.displayinfo();
        Student student3 = new Student("Najmul", 232002276);
        student3.displayinfo();
    }
}
