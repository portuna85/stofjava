package Lamda_Stream.LambdaPack.JavaUtilFunction;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_7 {
    public static void main(String[] args) {
        Supplier<MyClass> s1 = () -> new MyClass();
        System.out.println(s1.get());

        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get() == (s1.get()));

        Function<Integer, MyClass> s3 = i -> new MyClass();
        Function<Integer, MyClass> s4 = MyClass::new;

        System.out.println(s4.apply(241));

        Function<Integer, int[]> f1 = i -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;

        int[] arr = f1.apply(200);
        System.out.println(arr.length);
        System.out.println(f1.hashCode());
    }
}

class MyClass {
    private int num;

    public MyClass() {}

    public MyClass(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("ㅋㅋ");
    }
}