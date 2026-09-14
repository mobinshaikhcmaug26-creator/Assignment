class ShapeBase {

    public void shape() {
        System.out.println("This is shape");
    }

}

class Rectangle extends ShapeBase {

    public void rectangle() {
        System.out.println("This is rectangular shape");
    }

}

class Circle extends ShapeBase {

    public void circle() {
        System.out.println("This is circular shape");
    }

}

class Square extends Rectangle {

    public void square() {
        System.out.println("Square is a rectangle");
    }

}

public class Shape {

    public static void main(String[] args) {

        Square s = new Square();

        s.shape();

        s.rectangle();

        s.square();

    }

}