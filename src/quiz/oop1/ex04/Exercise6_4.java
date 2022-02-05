package quiz.oop1.ex04;

public class Exercise6_4 {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("홍길동");
        s.setBan(1);
        s.setNo(1);
        s.setEng(60);
        s.setKor(100);
        s.setMath(70);

        System.out.println("이름 : " + s.getName());
        System.out.println("총점 : " + s.getTotal());
        System.out.println("총점 : " + s.getAverage());

    }
}
