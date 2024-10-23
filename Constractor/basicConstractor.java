package Constractor;
class StudentInfo{
    String name,dept,program;
    int id,batch;
    StudentInfo(String n, String d, String p, int i, int b){
        name = n;
        dept = d;
        program = p;
        id = i;
        batch = b;

    }
    void displayinfo(){
        System.out.println("Student Information");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Program: "+program);
        System.out.println("Student ID: "+id);
        System.out.println("Batch: "+batch);
        System.out.println();
    }
}

public class basicConstractor {
    public static void main(String[] args) {
        StudentInfo student1 = new StudentInfo("Ashab Uddin","CSE","Undergraduate",232002274,232);
        student1.displayinfo();

        StudentInfo student2 = new StudentInfo("Imran Hosen", "EEE", "Undergaduate", 232001084, 232);
        student2.displayinfo();

    }
}
