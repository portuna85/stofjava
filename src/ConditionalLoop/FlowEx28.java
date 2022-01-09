package ConditionalLoop;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer;

        answer = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.println(answer);
        do {
            System.out.println("1과 100사이 정수를 입력해주세요. : ");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 정수를 입력해주세요.");
            } else {
                System.out.println("더 큰 정수를 입력해 주세요.");
            }

        } while (input != answer);
        System.out.println("정답입니다.");
    }
}
