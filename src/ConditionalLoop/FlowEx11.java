package ConditionalLoop;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.printf("주민번호(-)포함해 13자리 입력 : ");
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char ch = regNo.charAt(7);

        switch (ch) {
            case '1':
            case '3':
                switch (ch) {
                    case '1':
                        System.out.println("2000년 이전 출생한 남자");
                        break;
                    case '3':
                        System.out.println("2000년 이후 출생한 남자");
                }
                break;

            case '2':
            case '4':
                switch (ch) {
                    case '2':
                        System.out.println("2000년 이전 출생한 여자");
                        break;
                    case '4':
                        System.out.println("2000년 이후 출생한 여자");
                }
                break;
        }
    }
}