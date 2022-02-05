package Lamda_Stream.Streampack.OptionalLambda;

public class Student implements Comparable<Student> {
    private String name;
    private int ban;
    private int totalScore;

    public Student() {
    }

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", this.name, this.ban, this.totalScore).toString();
    }

    @Override
    public int compareTo(Student o) {
        return o.totalScore - this.totalScore;
    }
}
