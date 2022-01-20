package test.interface_text;

public class Sonata extends Car {
    private int turboSpeed;

    @Override
    public void make(String color, int price) throws ArithmeticException {
        int a = 9;
        int i = a / 0;
    }

    public void run(int getSpeed) {
        super.speed = getSpeed;
        System.out.println("Sonata가 지금 속도는 : " + super.speed + "km/h로 달립니다.");
    }

    public void turbo() {
        this.turboSpeed = (Sonata.super.speed + (int) (Math.random() * Sonata.super.speed));
        System.out.println("Sonata가 터보모드로 " + this.turboSpeed + "km/h로 달립니다.");
    }

    public void create() {
        make("red", 100);
    }

    public void distroy() throws ArrayIndexOutOfBoundsException {}
}