package quiz.oop1.ex03;

public class Student {
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    public Student() {
    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void getInfo1() {
        System.out.println(getName() + getBan() + getNo() + getEng() + getMath()
                + getKor() + getTotal() + getAverage());
    }


    public int getTotal() {
        return this.eng + this.kor + this.math;
    }


    public float getAverage() {
        return (float) ((int) (((float) getTotal() / 3) * 100)) / 100;
    }

    public String info() {
        return getName() + getBan() + getNo() + getKor() + getEng() + getMath() + getTotal() + getAverage();

    }
}
