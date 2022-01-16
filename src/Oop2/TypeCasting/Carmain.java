package Oop2.TypeCasting;

public class Carmain {
    public static void main(String[] args) {
        FireEngine f1 = new FireEngine();
        Car c1 = (Car) f1;
        FireEngine f2 = null;

        f2 = f1;
        f1.color = "RED";
        f2 = (FireEngine) c1;
        c1.color = "Yellow";
        f2.water();
        System.out.println(c1.toString());
    }
}