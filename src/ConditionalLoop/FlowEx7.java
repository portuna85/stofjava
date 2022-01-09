package ConditionalLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.printf("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int) (Math.random() * 3) + 1;

        System.out.println("당신은 " + user + "입니다");
        System.out.println("컴은 " + com + "입니다");

        // user가 이기는 경우  가위(1), 바위(2), 보(3)
        // user=1 vs com=3
        // user=2 vs com=1
        // user=3 vs com=2

        // user가 지는 경우  가위(1), 바위(2), 보(3)
        // user=1 vs com=2
        // user=2 vs com=3
        // user=3 vs com=1

        switch(user-com) {
            case -2: case 1:
                System.out.println("당신은 이겼습니다.");
                break;
            case -1: case 2:
                System.out.println("당신이 졌습니다.");
                break;
            default:
                System.out.println("비겼습니다.");
        }
    }
}
