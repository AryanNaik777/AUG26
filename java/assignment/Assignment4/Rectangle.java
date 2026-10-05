package Inheritance;


public class Rectangle extends Shape{

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double getAreaRectangle() {
        return length * breadth;
    }

    double getPerimeterRectangle() {
        return 2 * (length + breadth);
    }

    void displayRectangle() {
        System.out.println("This is Rectangular shape");
    }
}
