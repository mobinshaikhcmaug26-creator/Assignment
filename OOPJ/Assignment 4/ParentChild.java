class Parent {

    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    public void childMethod() {
        System.out.println("This is child class");
    }
}

public class ParentChild {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.parentMethod();
        c.childMethod();
        c.parentMethod();
    }
}