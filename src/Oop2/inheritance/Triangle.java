package Oop2.inheritance;

public class Triangle extends Shape {
    Point[] p;                          // 3개의 Point인스턴스를 담을 배열 생성

    public Triangle(Point[] p) {        // 생성자 생성
        this.p = p;                     // 생성자 초기화
    }

    public void draw() {
        System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s\n",
                p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
