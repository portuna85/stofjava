package quiz.oop1.ex06;

public class Excercise6_6 {
    public static void main(String[] args) {
        System.out.println(getDistance1(1, 1, 2, 2));    // 1.4142135623730951

        System.out.println(getDistance2(1, 1, 2, 2));    // 1.4142135623730951
    }

    public static double getDistance1(int x, int y, int x1, int y1) {
        return Math.sqrt((x1 + y1) - (x + y));
    }

    public static double getDistance2(int x, int y, int x1, int y1) {
        return Math.sqrt(Math.pow(y1 - y, 2) + Math.pow(x1 - x, 2));
    }
}


