package Oop;

public class SingleTonExample {

    public static SingleTonExample instanceUsingMethod;

    private SingleTonExample() {
    }

    public static SingleTonExample getInstance() {

        if (instanceUsingMethod == null) {
            return new SingleTonExample();
        }

        return instanceUsingMethod;
    }

    public void run() {

    }

    public void make() {

    }

    public void selectAllItems() {

    }
}
