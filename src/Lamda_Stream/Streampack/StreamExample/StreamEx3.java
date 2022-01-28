package Lamda_Stream.Streampack.StreamExample;

import java.io.InputStream;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("이자바", 3, 350),
                new Student("김자바", 7, 320),
                new Student("안자바", 8, 850),
                new Student("박자바", 1, 950),
                new Student("소자바", 1, 665),
                new Student("나자바", 1, 467),
                new Student("감자바", 1, 486)
        };

        Stream<Student> stuStream = Stream.of(stuArr);

        stuStream.sorted(Comparator.comparing(Student::getBan)
                                   .thenComparing(Comparator.naturalOrder()))
                 .forEach(System.out::println);

        stuStream = Stream.of(stuArr);
        IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore);

        IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
        System.out.println("count = " + stat.getCount());
        System.out.println("sum = " + stat.getSum());
        System.out.println("average = " + stat.getAverage());
        System.out.println("min = " + stat.getMin());
        System.out.println("max = " + stat.getMax());
    }
}