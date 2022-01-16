package test;

public class aasdf {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();

    }
}

class A {
    public A() {
    }

    public String x() {
        return "x";
    }


}
class B extends A{
    public B() {
        super();
    }

    public String x() {
        return "B.x";
    }

    public String y() {
        return "y";
    }
}
