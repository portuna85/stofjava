package Oop1;

public class ParamReference {
    public static void main(String[] args) {
        Data d2 = new Data();                            // Date 타입 d1 참조변수를 객체생성해서 대입
        d2.x = 10;
        System.out.println(d2.x);

        change(d2);
        System.out.println(d2.x);
    }
    public static void change(Data d) {
        d.x = 10000;                                       // 로컬 참조(Data)타입 매개변수 10000으로 초기화
        System.out.println(d.x);
    }
}
