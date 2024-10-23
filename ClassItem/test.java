package ClassItem;


public class test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Ashab";
        teacher1.dept = "CSE";
        teacher1.id = 202;

        teacher2.name = "Imran";
        teacher2.dept = "EEE";
        teacher2.id = 201;


        System.out.println("Teacher's Name: " + teacher2.name);
        System.out.println("Teacher's Department: " + teacher2.dept);
        System.out.println("Teacher's ID: " + teacher2.id);
        System.out.println();
        teacher1.displayinfo();
    }
}
