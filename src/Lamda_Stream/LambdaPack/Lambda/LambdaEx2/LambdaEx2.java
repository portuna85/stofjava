package Lamda_Stream.LambdaPack.Lambda.LambdaEx2;

@FunctionalInterface
interface MyFunction {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        MyFunction f1 = new MyFunction() {
            @Override
            public void myMethod() {}
        };


        Object obj = (MyFunction) (() -> {});
        Object obj1 = (MyFunction) (new MyFunction() {
            @Override
            public void myMethod() {}
        });

        String str = ((Object) (MyFunction) (() -> {})).toString();
        String str1 = ((Object) (MyFunction) (new MyFunction() {
            @Override
            public void myMethod() {}
        })).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction) (() -> {}));
        System.out.println(((Object) (MyFunction) (() -> {})).toString());
    }
}