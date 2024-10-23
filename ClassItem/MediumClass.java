package ClassItem;
class Students{
    String name ,dept,program;
    int batch, id;

    void setInfo(String n, String dep, String prog, int bch ,int i){
        name = n;
        dept  = dep;
        program = prog;
        batch = bch;
        id = i;
    }

    void displayinfo(){
        System.out.println("Student Infromation");
        System.out.println("Name: "+name);
        System.out.println("Dept: "+dept);
        System.out.println("Program: "+program);
        System.out.println("Batch: "+batch);
        System.out.println("ID: "+id);
    }

}

public class MediumClass {
    public static void main(String [] args){
        Students student1 = new Students();
        student1.setInfo("Ashab Uddin","CSE","Undergraduate",232,232002274);
        student1.displayinfo();

    }
}
