package quiz.ch04;

public class Exercise4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;
        // 완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("sum = " + sum);
    }
}