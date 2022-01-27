package Lamda_Stream.LambdaPack.Predicate;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);

        Function<String, Integer> f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s, 16);
            }
        };

        Function<Integer, String> g = new Function<Integer, String>() {
            @Override
            public String apply(Integer i) {
                return Integer.toBinaryString(i);
            }
        };

        Function<String, String> h = f.andThen(g);
        h.apply("a");
        /*
        Function<String, String> h1 = new Function<>() {        // Function<String, Integer>   Function<Integer, String>
            @Override                                           // Function<Integer, Integer> h2 = f.compose(g);
            public String apply(String s) {
                return f.andThen(g);
            }
        };
        */

        Function<Integer, Integer> h2 = f.compose(g);
        /*
        Function<Integer, Integer> h3 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return f.compose(g);
            }
        };
        */

        System.out.println(h.apply("FF"));
        System.out.println(h2.apply(2));
        System.out.println();

        Function<String, String> f2 = x -> x;
        Function<String, String> f3 = new Function<>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };

        System.out.println(f2.apply("AAA"));
        System.out.println();

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return (integer < 100);
            }
        };

        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println("p : " + p.test(50));
        System.out.println("p1 : " + p1.test(50));
        System.out.println("q : " + q.test(50));
        System.out.println("r : " + r.test(67));
        System.out.println("notP : " + notP.test(64));
        System.out.println("all.test(50) : " + all.test(150));

        String str1 = new String("abc");
        String str2 = new String("abc");
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}