package Easy_Assignment;


public class Complex {
    int real;
    int imaginary;

    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c2) {
        System.out.println("Addition: " + (this.real + c2.real) + " + " + (this.imaginary + c2.imaginary) + "i");
    }

    void difference(Complex c2) {
        System.out.println("Difference: " + (this.real - c2.real) + " + " + (this.imaginary - c2.imaginary) + "i");
    }

    void product(Complex c2) {
        System.out.println("Product: " + (this.real * c2.real) + " + " + (this.imaginary * c2.imaginary) + "i");
    }


}
