package Lamda_Stream.Streampack.OptionalLambda;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamEx5 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritancee", "JAVA", "LAMBDA", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr)
                                       .filter(s -> s.charAt(0) == 's').findFirst();
    }
}
