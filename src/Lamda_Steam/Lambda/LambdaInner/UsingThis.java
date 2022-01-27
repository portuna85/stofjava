package Lamda_Steam.Lambda.LambdaInner;

import Lamda_Steam.test.MyFunctionalInterface;

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
