package Lamda_Steam.Lambda;

@FunctionalInterface
interface myFunction {
    void run();
}

public class LambdaEx1 {
    static void execute(myFunction f) {
        f.run();
    }

    static myFunction getMyFunction() {
        myFunction f = () -> System.out.println("f3.run");
        return f;
    }

    public static void main(String[] args) {
        myFunction f1 = () -> System.out.println("f1.run()");

        myFunction f2 = new myFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        myFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}