package Easy_Assignment;


public class Rectangle {
//	3. Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//	respectively by creating a class named 'Rectangle' with a method named 'area'
//	which returns the area and length and breadth passed as parameters to its constructor.

    double length;
    double breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }
}
