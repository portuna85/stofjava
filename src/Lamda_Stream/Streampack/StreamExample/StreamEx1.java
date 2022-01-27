package Lamda_Stream.Streampack.StreamExample;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("ASDF", 3,350),
                new Student("qwer", 7,320),
                new Student("zxcv", 8,850),
                new Student("tyui", 1,950)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan));
    }
}