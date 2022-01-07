package Operator;

public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'A';
        char h = 'H';
        char nine = '9';

        System.out.println(a - nine);
        System.out.println((int) nine);
        System.out.println(nine);
        System.out.println(h);
        System.out.println((int) h);

        char a1 = 'a';

        System.out.println(a1 + 1);
        System.out.println((char) (a1 + 1));

        System.out.println(a1++);
        System.out.println((int) a1++);

        // char i1 = h + 1;             // 컴파일 에러 발생
        char i2 = 'H' + 1;
        System.out.println(h + 1);

        char lowerCase = (char) (a + 32);
        System.out.println("대문자 : " + a + "소문자 : " + lowerCase);
    }
}
