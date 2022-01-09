package ConditionalLoop;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 숫자 입력 : ");

        while (flag) {
            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }
        }
        System.out.println("합계 : " + sum);
    }
}
