import java.util.Scanner;

public class Complex {

    int real;
    int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void sum(Complex c) {
        System.out.println("Sum: " + (real + c.real) + " + " + (imaginary + c.imaginary) + "i");
    }

    public void difference(Complex c) {
        System.out.println("Difference: " + (real - c.real) + " + " + (imaginary - c.imaginary) + "i");
    }

    public void product(Complex c) {
        int realPart = (real * c.real) - (imaginary * c.imaginary);
        int imaginaryPart = (real * c.imaginary) + (imaginary * c.real);

        System.out.println("Product: " + realPart + " + " + imaginaryPart + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();

        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        sc.close();
    }
}