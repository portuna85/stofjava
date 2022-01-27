package Lamda_Stream.LambdaPack.Lambda.LambdaInner;

import Lamda_Stream.test.MyFunctionalInterface;

public class UsingThis {
    private int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println(UsingThis.this.outterField);
                System.out.println(innerField);
            };
            fi.method();
        }

    }
}
