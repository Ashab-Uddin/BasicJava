/*
 * Problem-1
To solve this problem knowledge required about class, objects, variables, data types, methods, constructor.

Create a class called Box that includes three pieces of information as instance variables—height, width, and depth (type double) of two boxes. Your class should have a constructor and initialize the three instance variables. Provide a method displayVol that displays the volume of two boxes. Suppose, the values of instance variables for the first box's are (10, 10, 10) and the second box's are (20, 30, 10). Write a test application named BoxVolume that demonstrates the class Box's capabilities.
 */

package problem;
class Box{
    double height,width,depth;

    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }
    void displayvol(){
        double vol = height*width*depth;
        System.out.println("Voulme of Box is = "+vol);
    }
}


public class boxProblem {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.displayvol();

        Box box2 = new Box(20, 30, 10);
        box2.displayvol();
    }
}
