package Oop2.polymorphism.instance_of;

public class FireEngine extends Car {

    public FireEngine() {
        super();
    }

    public FireEngine(String color, int door) {
        super(color, door);
    }

    public void water() {
        System.out.println("물을 뿌립니다.");
    }
}