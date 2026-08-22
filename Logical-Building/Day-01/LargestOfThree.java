public class LargestOfThree {
    public static void main(String[] args) {

        int a = 25;
        int b = 40;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("A is Largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("B is Largest: " + b);
        } else {
            System.out.println("C is Largest: " + c);
        }
    }
}