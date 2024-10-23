package instanceVariableHiding;
class Box{
        double height,width,depth;//instance vairable
    
        Box(double height,double width,double depth){
            /*h,w,d is local variable , so in this area local variable demant is high When we declared instance variable and local variable is same . then two variable is same as local variable.
            example: height = height;
            left side height is instance variabel.right side height is local variable.
            So, we use this property.
            this.height = height;
            this.height refared to instance variabe.
            height refared to local variabe.
            */
            this.height = height;
            this.width = width;
            this.depth = depth;
        }
        void displayvol(){
            double vol = height*width*depth;
            System.out.println("Voulme of Box is = "+vol);
        }
    }
    

public class instanceVariableHidingProblem {
        public static void main(String[] args) {
            Box box1 = new Box(10, 10, 10);
            box1.displayvol();
    
            Box box2 = new Box(20, 30, 10);
            box2.displayvol();
        }
    
}
