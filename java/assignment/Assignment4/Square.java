package Inheritance;


public class Square extends Rectangle{
    double side;

    Square(double length, double breadth, double side){
        super(length, breadth);
        this.side = side;
    }

    double getAreaSquare() {
        return side*side;
    }

    double getPerimeterSquare() {
        return 2*side;
    }

    void displaySquare() {
        System.out.println("Square is a rectangle");
    }

}