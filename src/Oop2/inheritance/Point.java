package Oop2.inheritance;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public String getXY(){
        return "(" + x + "," + y +")";
    }       // x와 y의 값을 문자열로 반환
}