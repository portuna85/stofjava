package Lamda_Steam.Lambda.LambdaEx3;

@FunctionalInterface
interface MyFunction {
    void myMethod();
}

public class LambdaEx3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) {
            int val = 30;

            MyFunction f = () -> {
                System.out.println("\t\t\t i : " + i);
                System.out.println("\t\t\t val : " + val);
                System.out.println("\t\t\t this.val : " + this.val);
                System.out.println("\t Outer.this.val : " + Outer.this.val);
            };
            f.myMethod();
        }
    }
}