package ConditionalLoop;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.printf("숫자 하나를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.printf("입력한 숫자는 0입니다.");
        }
        if (input != 0) {
            System.out.println("입력한 숫자가 0이 아닙니다.");
            System.out.printf("입력한 숫자는 %d입니다.", input);
        }
    }
}