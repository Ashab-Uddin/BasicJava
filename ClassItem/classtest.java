package ClassItem;
class students {  
    String name, dept , batch, program;
    int id;

    void displayinfo(){
        System.out.println("Student Information: ");
        System.out.println("Name: "+name);
        System.out.println("Dept: "+dept);
        System.out.println("Batch: "+batch);
        System.out.println("Program: "+program);
        System.out.println("ID: "+id);
    }
}


public class classtest {
    public static void main(String[] args) {
        students student1 = new students();
        student1.name ="Ashab uddin";
        student1.dept = "CSE";
        student1.batch = "242";
        student1.program = "Undergaduate";
        student1.id = 232002274;
        student1.displayinfo();
    }
}


