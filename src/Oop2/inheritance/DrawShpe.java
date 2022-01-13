package Oop2.inheritance;

public class DrawShpe {
    public static void main(String[] args) {
        Point[] p = {new Point(100, 100),
                new Point(200, 200),
                new Point(300, 300),
        };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);

        t.draw();
        c.draw();
    }
}