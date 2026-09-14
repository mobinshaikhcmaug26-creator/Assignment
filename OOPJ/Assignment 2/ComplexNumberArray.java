import java.util.Scanner;

class ComplexNumber {

    int number1;
    int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public int computeComplexNumber() {
        return number1 * number2;
    }
}

public class ComplexNumberArray {

    public static void main(String[] args) {

        ComplexNumber[] arr = new ComplexNumber[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            arr[i] = new ComplexNumber();

            System.out.print("Enter number1: ");
            arr[i].setNumber1(sc.nextInt());

            System.out.print("Enter number2: ");
            arr[i].setNumber2(sc.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Result: " + arr[i].computeComplexNumber());
        }

        sc.close();
    }
}

