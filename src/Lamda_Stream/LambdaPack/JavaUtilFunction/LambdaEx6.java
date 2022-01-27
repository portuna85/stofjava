package Lamda_Stream.LambdaPack.JavaUtilFunction;

import java.util.Arrays;
import java.util.function.*;

public class LambdaEx6 {
    static void makeRandomList(IntSupplier s, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.getAsInt();
        }
    }

    static void printEvenNum(IntPredicate p, IntConsumer c, int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static int[] doSomething(IntUnaryOperator f, int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = f.applyAsInt(arr[i]);
        }
        return newArr;
    }

    static Integer method(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        IntSupplier s = () -> (int) (Math.random() * 45) + 1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i % 2 == 0;
        IntUnaryOperator u = i -> i / 10 * 10;

        Function<String, Integer> f = Integer::parseInt;

        System.out.println(f.apply("11"));

        Supplier<LambdaEx6> s2 = LambdaEx6::new;


        int[] arr = new int[10];

        makeRandomList(s, arr);
        System.out.println(Arrays.toString(arr));
        printEvenNum(p, c, arr);

        int[] newArr = doSomething(u, arr);
        System.out.println(Arrays.toString(newArr));
    }
}