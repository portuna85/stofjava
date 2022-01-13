package Oop2.Overriding;

public class OverrideTest {
    public static void main(String[] args) {
        MyPoint3D mypoint = new MyPoint3D();
        mypoint.x = 39;
        mypoint.y = 24;
        mypoint.z = 66;

        System.out.println(mypoint);
    }
}

class Point {
    public int x;
    public int y;
    public String getLocation() {
        return "x : " + x + ", y : " + y;
    }
}

class MyPoint3D extends Point {
    public int z;

    @Override
    public String toString() {
        return "MyPoint3D{" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }
}