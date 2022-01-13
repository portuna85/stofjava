package Oop2.inheritance;

public class Circle extends Shape {            // Shape클래스를 상속 받기
    public Point center;
    public int r;

    public Circle(){
        /*
        this.center.x = 0;
        this.center.y = 0;
        this.r = 100;
        */
        this(new Point(0, 0), 100);     // Circle(Point center, int r)을 호출
    }

    public Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    public void draw(){                        // 원의 정보출력 메소드
        System.out.printf("[center = (%d, %d), r = %d,color = %s]%n",
                center.x, center.y, r, color);
    }
}