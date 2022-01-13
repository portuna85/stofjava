package Oop1;

public class SingleTonExample {

    public int sum;
    public static SingleTonExample ccc = null;

    private SingleTonExample() {
    }

    public static SingleTonExample getInstance() {

        if (ccc == null) {
            ccc = new SingleTonExample();
        }

        return ccc;

    }

}
