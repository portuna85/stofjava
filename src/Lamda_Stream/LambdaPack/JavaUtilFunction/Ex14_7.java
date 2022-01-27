package Lamda_Stream.LambdaPack.JavaUtilFunction;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class Ex14_7 {
    public static void main(String[] args) {
        Supplier<MyClass> s1 = () -> new MyClass();
        System.out.println(s1.get());

        Supplier<MyClass> s2 = MyClass::new;
        System.out.println(s2.get());

        Function<Integer, MyClass> f3 = i -> new MyClass();
        Function<Integer, MyClass> f4 = MyClass::new;

        System.out.println("f3 " + f3.apply(29));

        Function<Integer, int[]> f1 = i -> new int[i];
        Function<Integer, int[]> f2 = int[]::new;

        int[] arr = f1.apply(20);
        System.out.println(arr.length);
        System.out.println(f1.apply(80).length);

        ToIntFunction<Integer> tif1 = (i) -> (int) ((Math.random() * 45) + 1);
        ToIntFunction<Integer> tif2 = new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer i) {
                return (int) ((Math.random() * 45) + 1);
            }
        };

        System.out.println(tif2);

        System.out.println(tif1.applyAsInt((int) ((Math.random() * 45) + 1)));
    }
}

class MyClass {
    private int num;

    public MyClass() {
    }

    public MyClass(int num) {
        this.num = num;
    }


    public void run() {
        System.out.println("ㅋㅋ");
    }
}