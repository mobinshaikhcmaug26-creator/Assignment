import java.util.Scanner;

public class SumOfTwoNumbers {

    static int sumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = sumOfTwoNumbers(a, b);

        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");

        sc.close();
    }
}