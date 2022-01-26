package Lamda_Steam.JavaUtilFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> tList = new ArrayList<>(list.size());
        for (T t : list) {
            tList.add(f.apply(t));
        }
        return tList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T t : list) {
            if (p.test(t)) {
                c.accept(t);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> (i % 2 == 0);
        Function<Integer, Integer> f = i -> i / 10 * 10;
        List<Integer> list = new ArrayList<>();

        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p, c, list);
        List<Integer> list1 = doSomething(f, list);
        System.out.println(list1);
    }
}