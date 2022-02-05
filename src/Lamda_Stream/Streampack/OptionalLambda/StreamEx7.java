package Lamda_Stream.Streampack.OptionalLambda;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import static java.util.stream.Collectors.partitioningBy;

public class StreamEx7 {
    public static void main(String[] args) {
        Student1[] stuArr = {
                new Student1("나자바", true, 1, 1, 300),
                new Student1("김지미", false, 1, 1, 250),
                new Student1("김자바", true, 1, 1, 200),
                new Student1("이지미", false, 1, 2, 150),
                new Student1("남자바", true, 1, 2, 100),
                new Student1("안지미", false, 1, 2, 50),
                new Student1("황지미", true, 1, 3, 100),
                new Student1("강지미", false, 1, 3, 150),
                new Student1("이자바", true, 1, 3, 200),

                new Student1("나자바", true, 2, 1, 300),
                new Student1("김지미", false, 2, 1, 250),
                new Student1("김자바", true, 2, 1, 200),
                new Student1("이지미", false, 2, 2, 150),
                new Student1("남자바", true, 2, 2, 100),
                new Student1("안지미", false, 2, 2, 50),
                new Student1("황지미", true, 2, 3, 100),
                new Student1("강지미", false, 2, 3, 150),
                new Student1("이자바", true, 2, 3, 200),
        };

        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<Boolean, List<Student1>> stuBySex = Stream.of(stuArr)
                                                      .collect(partitioningBy(Student1::isMale));

        List<Student1> maleStudent = stuBySex.get(true);
        List<Student1> femaleStudent = stuBySex.get(false);

        for (Student1 student1 : maleStudent) {
            System.out.println(student1);
        }

        for (Student1 student1 : femaleStudent) {
            System.out.println(student1);
        }

        System.out.printf("%n2 . 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                                               .collect(partitioningBy(Student1::isMale,
                                                       counting()));
        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student1>> topScoreBySex = Stream.of(stuArr)
                                                               .collect(partitioningBy(Student1::isMale,
                                                                       maxBy(comparingInt(Student1::getScore))));
        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        Map<Boolean, Student1> topScoreBySex2 = Stream.of(stuArr)
                                                      .collect(partitioningBy(Student1::isMale,
                                                              collectingAndThen(
                                                                      maxBy(comparingInt(Student1::getScore)),
                                                                      Optional::get)));
        System.out.println("남학생 1등 : " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");
        Map<Boolean, Map<Boolean, List<Student1>>> failedStuBySex =
                Stream.of(stuArr).collect(partitioningBy((Student1::isMale),
                        partitioningBy(s -> s.getScore() <= 100)));

        List<Student1> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student1> failedFeMaleStu = failedStuBySex.get(false).get(true);

        for (Student1 student1 : failedMaleStu) {
            System.out.println(student1);
        }

        for (Student1 student1 : failedFeMaleStu) {
            System.out.println(student1);
        }
    }
}
