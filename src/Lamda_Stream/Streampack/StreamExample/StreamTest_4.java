package Lamda_Stream.Streampack.StreamExample;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest_4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStm = Stream.of(new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );
        // Stream<Stream<String>> strStrmStrm = strArrStm.map(Arrays::stream);
        Stream<String> strStrm = strArrStm.flatMap(Arrays::stream);

        strStrm
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        String[] lineArr = {
                "Belive or not It is true.",
                "Do or do not There is no try"
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                  .map(String::toLowerCase)
                  .distinct()
                  .sorted()
                  .forEach(System.out::println);
        System.out.println();

        Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");
        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
        strStream.map(String::toUpperCase)
                 .distinct()
                 .forEach(System.out::println);
    }
}