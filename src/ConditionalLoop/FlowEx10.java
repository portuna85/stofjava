package ConditionalLoop;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 점수를 입력해주세요.");
        int i = sc.nextInt();

        switch (i / 10) {
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
    }
}
