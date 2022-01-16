package Oop2;

public class SmartTv extends Tv {
    public SmartTv() {
        super();
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double average(double x, double y) {
        minus(4, 5);
        return (x + y) / 2;
    }

    public static int minus(int x, int y) {
        SmartTv s = new SmartTv();
        s.average(4, 5);
        return x - y;
    }
}