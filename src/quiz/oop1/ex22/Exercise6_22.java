package quiz.oop1.ex22;

public class Exercise6_22 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 은 숫자입니까? " + Compare.isNumber(str));
        str = "1234o";
        System.out.println(str + " 은 숫자입니까? " + Compare.isNumber(str));
    }
}