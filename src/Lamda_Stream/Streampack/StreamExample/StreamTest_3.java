package Lamda_Stream.Streampack.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest_3 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 5, 1, 4, 7, 2);
        Stream<Integer> intStream = intList.stream();



        intStream.distinct()
                .sorted()
                .forEach(System.out::println);
    }
}