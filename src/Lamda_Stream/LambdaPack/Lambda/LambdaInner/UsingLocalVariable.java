package Lamda_Stream.LambdaPack.Lambda.LambdaInner;

public class UsingLocalVariable {
    void method(int arg) {
        int lovalVar = 40;

        MyfunctionalInterface fi = () -> {
            System.out.println("arg : " + arg);
            System.out.println("localVar " + lovalVar);
        };
        fi.method();
    }
}
