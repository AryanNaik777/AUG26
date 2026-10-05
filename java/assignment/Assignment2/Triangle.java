package Easy_Assignment;

public class Triangle {
//	2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
//	by creating a class named 'Triangle' with constructor having the three sides as its parameters.

    double side1;
    double side2;
    double side3;

    Triangle(double pSide1, double pSide2, double pSide3){
        this.side1 = pSide1;
        this.side2 = pSide2;
        this.side3 = pSide3;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }

    double getArea() {
        double semiPerimeter = getPerimeter()/2;
        double area = Math.sqrt(semiPerimeter*(semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

        return area;

    }
}
