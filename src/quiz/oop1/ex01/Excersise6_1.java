package quiz.oop1.ex01;

public class Excersise6_1 {
    public static void main(String[] args) {
        Student card1 = new Student(3, false);
        Student card2 = new Student();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}