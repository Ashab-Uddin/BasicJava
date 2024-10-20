package report;

class Shape {
    int length;
    int breadth;


    Shape(int i) {
        this.length = i;
        this.breadth = i;  
    }


    Shape(int m, int n) {
        this.length = m;
        this.breadth = n;
    }


    public int calculateArea(int i) {
        return (i * i);  
    }


    public int calculateArea(int m, int n) {
        return (m * n);  
    }


    public int calculatePerimeter(int i) {
        return (4 * i);  
    }


    public int calculatePerimeter(int m, int n) {
        return 2 * (m + n);  
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        
        Shape square = new Shape(6);
        
        Shape rectangle = new Shape(9, 15);

        
        int squareArea = square.calculateArea(square.length);
        int squarePerimeter = square.calculatePerimeter(square.length);

        
        int rectangleArea = rectangle.calculateArea(rectangle.length, rectangle.breadth);
        int rectanglePerimeter = rectangle.calculatePerimeter(rectangle.length, rectangle.breadth);

        
        System.out.println("Area of Square: " + squareArea + "\n" + "Perimeter of Square: " + squarePerimeter);
        System.out.println("Area of Rectangle: " + rectangleArea + "\n" + "Perimeter of Rectangle: " + rectanglePerimeter);
    }
}
