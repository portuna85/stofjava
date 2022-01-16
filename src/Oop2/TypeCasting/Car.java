package Oop2.TypeCasting;

public class Car {
    public String color;
    public int door;

    public Car() {
    }

    public Car(String color, int door) {
        this.color = color;
        this.door = door;
    }

    public void drive() {
        System.out.println("운전");
    }

    public void stop() {
        System.out.println("정지");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                '}';
    }
}
