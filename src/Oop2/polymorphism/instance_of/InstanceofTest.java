package Oop2.polymorphism.instance_of;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        InstanceofTest s = new InstanceofTest();
        if (fe instanceof FireEngine) {
            fe.water();
        } else {
            System.out.println("형변환 불가");
        }
    }

    public void doWork(Car fe, Car car) {

    }
}