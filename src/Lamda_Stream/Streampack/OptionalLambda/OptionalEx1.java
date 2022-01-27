package Lamda_Stream.Streampack.OptionalLambda;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);

        System.out.println("optStr : " + optStr);
        System.out.println("optInt : " + optInt);

        int result1 = Optional.of("12345")
                              .filter(x -> x.length() > 0)
                              .map(Integer::parseInt).get();

        int result2 = Optional.of("")
                              .filter(x -> x.length() > 0)
                              .map(Integer::parseInt).orElse(-1);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);

        OptionalInt optInt1 = OptionalInt.of(6);
        OptionalInt optInt2 = OptionalInt.empty();

        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());
    }
}