package Lamda_Stream.LambdaPack.Lambda;

public class MyFunctionalInterfaceEx {
    public static void main(String[] args) {
        MyFunctionalInterface mf;
        mf = () -> {
            System.out.println("method call1");
        };
        mf.method();

        Car car = x -> ++x;

        System.out.println(car.run(4));

        Turbo t = (x, y) -> sum(x, y);

        System.out.println(t.turbo(4, 6));

    }

    public static int sum(int x, int y) {
        return (x + y);
    }

}
