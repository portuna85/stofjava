package Lamda_Stream.Streampack.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 6, 4, 3, 5);
        Stream<Integer> intStream = list.stream();
        intStream.sorted()
                 .forEach(System.out::print);
        System.out.println();

        // stream은 1회용. stream에대헤 최종연산후 닫힘.
        Stream<Integer> intStream1 = list.stream();
        intStream1.forEach(System.out::print);
        System.out.println();

        String[] chArr = {"a", "b", "e", "d", "c"};
        Stream<String> chStream = Stream.of(chArr);
        Arrays.stream(chArr);
        chStream.sorted()
                .forEach(System.out::print);
        System.out.println();

        int[] intArr = {9, 4, 1, 7, 10, 5, 8, 6, 2, 3};
        IntStream intStream2 = Arrays.stream(intArr);
        /*
        intStream2.sorted()
                  .forEach(System.out::print);
        */
        System.out.println();
        //System.out.println("sum = " + intStream2.sum());

        System.out.println("average = " + intStream2.average());

        System.out.println();

        Integer[] intArr1 = {9, 4, 1, 7, 5, 8, 6, 2, 3};
        Stream<Integer> intStream3 = Arrays.stream(intArr1);
        // intStream3.sorted()
        //          .forEach(System.out::print);
        System.out.println();

        System.out.println("intStream3.count() : " + intStream3.count());
    }
}