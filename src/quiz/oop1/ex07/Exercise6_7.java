package quiz.oop1.ex07;

public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getInstance(2, 2));
    }
}

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getInstance(int x, int y) {
        return Math.sqrt((x - this.x) + (y - this.y));
    }
}