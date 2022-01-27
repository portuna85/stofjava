package Lamda_Steam.test;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        Function<String, Integer> func1 = s -> {
            System.out.println("func1");
            return Integer.parseInt(s, 16);
        };
        Function<Integer, String> func2 = i -> {
            System.out.println("func2");
            return Integer.toHexString(i);
        };

        Function<String, String> funcResultAndThen = func1.andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2).andThen(func1).andThen(func2);
        Function<Integer, Integer> funcResultCompose = func1.compose(func2);

        funcResultAndThen.apply("F");


    }
}
