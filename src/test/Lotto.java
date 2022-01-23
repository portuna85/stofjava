package test;

public class Lotto {
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println("Lotto : " + str);
        Car.change(str);
        System.out.println("Lotto : " + str);
    }
}

class Car {
    public static void change(String str) {
        str = "456";
        System.out.println("Car : " + str);
    }
}