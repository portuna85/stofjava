package ConditionalLoop;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;

        System.out.println("아무 정수 입력 : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        while (num != 0) {
            sum += num % 10;
            System.out.printf("num = %3d, num의 합 %d\n", num, sum);
            num /= 10;
        }
        System.out.println();
    }
}