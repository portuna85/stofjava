package quiz.oop1.ex01;

public class Student {
    private int num;
    private boolean isKwang;

    public Student() {
        this(1, true);
    }

    public Student(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return num + (isKwang ? "K" : "");
    }
}
