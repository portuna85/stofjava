package Lamda_Stream.LambdaPack.Lambda.LambdaEx1;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    static void execute(MyFunction f) {
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction myFunction = () -> System.out.println("f1.run()");
        return myFunction;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = () -> System.out.println("f3.run()");

        f1.run();
        f2.run();
        f3.run();
    }
}