package Lamda_Stream.Streampack.StreamExample;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest_2 {
    public static void main(String[] args) {
     /*   IntStream intStream = new Random().ints(3, 10);
        intStream.limit(10)
                 .sorted()
                 .forEach(System.out::println);
        System.out.println("---------------------");

        IntStream range = IntStream.range(1, 5);
        range.forEach(System.out::println);
        System.out.println("---------------------");*/

        Stream<Integer> iterate = Stream.iterate(1, i -> i + 2);
        iterate.limit(5)
               .forEach(System.out::println);

        Stream<Integer> intGenerate = Stream.generate(() -> 4);
        intGenerate.limit(10)
                   .forEach(System.out::println);

        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10)
                 .forEach(System.out::println);
    }
}