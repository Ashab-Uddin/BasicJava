package ClassItem;

public class test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(); 
        teacher1.name = "Ashab";
        teacher1.dept = "CSE";
        teacher1.id = 202;


        System.out.println("Teacher's Name: " + teacher1.name);
        System.out.println("Teacher's Department: " + teacher1.dept);
        System.out.println("Teacher's ID: " + teacher1.id);
    }
}
