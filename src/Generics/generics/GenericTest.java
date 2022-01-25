package Generics.generics;

import java.util.HashMap;

public class GenericTest {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<String, Student>();  // jdk1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 97));

        Student s = (Student) map.get("자바왕");
        System.out.println(s.getName());
        System.out.println(s.getEng());
        System.out.println(map.get("자바왕").getMath());
    }
}

class Student {
    private String name = "";
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
}