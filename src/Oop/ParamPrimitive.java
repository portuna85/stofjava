package Oop;

public class ParamPrimitive {
    public static void main(String[] args) {
        Data d1 = new Data();                         // Date 타입 d1 참조변수를 객체생성해서 대입

        d1.x = 10;
        System.out.println("main() : x = " + d1.x);

        change(d1.x);
        System.out.println("main() : x = " + d1.x);
    }

    public static void change(int x) {
        x = 10000;                                      // 로컬 기본(int)타입 매개변수 10000으로 초기화
        System.out.println("change = " + x);
    }
}