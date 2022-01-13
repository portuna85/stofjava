package Oop2;

public class inheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
    }
}

class MyPoint {
    public int x;
    public int y;
}

class Circle {
    MyPoint p;
    Circle() {
        p = new MyPoint();
    }
    public int r;
}