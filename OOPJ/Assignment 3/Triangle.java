public class Triangle {

    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int perimeter() {
        return side1 + side2 + side3;
    }

    public double area() {
        return 0.5 * side1 * side2;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Area: " + t.area());
        System.out.println("Perimeter: " + t.perimeter());
    }
}