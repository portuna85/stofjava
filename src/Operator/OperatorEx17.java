package Operator;

public class OperatorEx17 {
    public static void main(String[] args) {
        /*
        --- 반지름 셋째 자리 까지 표시 ---
        1. doubl타입 pi 선언후 초기화
        2. (double) pi를 100을 곱한다.
        3. (double) pi를 (int) pi로 형변환
        4. (int) pi를 (double) pi로 다시 형변환
        5. (double) pi를 다시 100으로 나눈다.
         */

        double pi = 3.141592;
        double shortPi = pi * 100;
        shortPi = (int) shortPi;
        double shortPi1 = shortPi / 100;

        System.out.println(shortPi1);
    }
}
