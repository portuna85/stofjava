package Oop1;

public class Car {
    public String color;
    public static String name;
    public String gearType;
    public int door;



    public Car() {

    }
    // 인스턴스 변수와 지역변수를 구별하기위해 참조변수 this를 사용.
    public Car(String color, String name, String gearType, int door) {
        this.color = color;
        this.name = name;
        this.gearType = gearType;
        this.door = door;
    }

    public Car(Car c) {                         // 인스턴스 복사를 위한 생성자.
        color  = c.color;
        name = c.name;
        gearType = c.gearType;
        door = c.door;
    }
}
