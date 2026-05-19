// Implement Following:  
// a. Create abstract class shapes with dim1, dim2 variables and abstract area() method. 
// Class 
// b. rectangle and triangle inherits shape class. Calculate area of rectangle and triangle.





// Abstract class
abstract class Shape {
    double dim1, dim2;

    // Constructor
    Shape(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    // Abstract method
    abstract double area();
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    double area() {
        return dim1 * dim2;
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(double base, double height) {
        super(base, height);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class Shapes {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}