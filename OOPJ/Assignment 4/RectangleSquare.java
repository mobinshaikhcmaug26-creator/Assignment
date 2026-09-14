public class RectangleSquare {

    static class Rectangle {

        int length;
        int breadth;

        Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public void area() {
            System.out.println("Rectangle Area: " + (length * breadth));
        }

        public void perimeter() {
            System.out.println("Rectangle Perimeter: " + (2 * (length + breadth)));
        }
    }

    static class Square extends Rectangle {

        Square(int side) {
            super(side, side);
        }

        public void squareArea() {
            System.out.println("Square Area: " + (length * breadth));
        }

        public void squarePerimeter() {
            System.out.println("Square Perimeter: " + (2 * (length + breadth)));
        }
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 5);

        r.area();
        r.perimeter();

        Square s = new Square(5);

        s.squareArea();
        s.squarePerimeter();
    }
}