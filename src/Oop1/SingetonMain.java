package Oop1;

public class SingetonMain {

    public static void main(String[] args) throws InterruptedException {

        SingleTonExample instance = SingleTonExample.getInstance();

        new Thread(

                () -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000000000; i++) {
                instance.sum += 1;
            }
            System.out.println("instance = " + instance.sum);
        }).start();
    }
}