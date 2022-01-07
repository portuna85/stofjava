package Operator;

public class OperatorEx24 {
    public static void main(String[] args) {
        int num;
        num = 15;

        // == 비교 연산
        System.out.println(num == 15);
        System.out.println(num == 'a');

        // != 연산
        System.out.println(num != 'a');
        System.out.println(num != 15);


        // && and 연산
        System.out.println(num>10 && num<20);
        System.out.println(num<10 && num<20);

        // || or 연산
        System.out.println(num > 10 || num < 20);
        System.out.println(num < 10 || num < 20);
        System.out.println(num < 10 || num > 20);
    }
}
