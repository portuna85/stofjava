package test.interface_text;

abstract class Car {
    public int speed;
    public String model;
    public static String name;

    public void run(int getSpeed) {
        this.speed = getSpeed;
        System.out.println("Car가 현재속도 " + this.speed + "km/h로 달리고 있습니다");
    }

    public abstract void turbo();

    protected void make(String color, int price) throws Exception {}

    public void method() throws NullPointerException {

    }
}