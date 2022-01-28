package Lamda_Stream.Streampack.StreamExample;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 350),
                new Student("김자바", 7, 320),
                new Student("안자바", 8, 850),
                new Student("박자바", 1, 950),
                new Student("소자바", 1, 665),
                new Student("나자바", 1, 467),
                new Student("감자바", 1, 486)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                                       .thenComparing(Comparator.naturalOrder()))
                     .forEach(System.out::println);
    }
}