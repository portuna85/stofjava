package Lamda_Stream.Streampack.StreamExample;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest_4 {
    public static void main(String[] args) {
        Stream<String[]> strArrStm = Stream.of(new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );
        Stream<Stream<String>> strStrmStrm = strArrStm.map(Arrays::stream);
        Stream<String> strStrm = strArrStm.flatMap(Arrays::stream);
        System.out.println(strStrmStrm);
        System.out.println(strStrm);
    }
}