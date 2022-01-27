package Lamda_Stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String[] strArr1 = {"aaa", "bbb", "ccc"};
        List<String> asList1 = Arrays.asList(strArr1);

        Stream<String> strStream1 = asList1.stream();
        Stream<String> strStream2 = Arrays.stream(strArr1);

        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
        List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list1);
        strStream2.forEach(System.out::println);

        IntStream intStream = new Random().ints(1, 46);
        intStream.distinct().limit(6).sorted().forEach(i -> System.out.printf(i + ", "));

        Stream<String> strStream = Stream.of("dd", "cc", "BBB", "bb", "AAA", "aa");
        IntStream intStream1 = IntStream.of(1, 9, 8, 4, 5, 6, 7, 3, 2);
        int sum = intStream1.parallel()
                            .sorted()
                            .sum();

        System.out.println(sum);
    }
}