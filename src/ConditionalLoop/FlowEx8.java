package ConditionalLoop;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.printf("주민번호(-)포함해 13자리 입력 : ");
        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char ch = regNo.charAt(7);

        switch (ch){
            case '1': case '3':
                System.out.println("남자 입니다.");
                break;
            case '2': case '4':
                System.out.println("여자 입니다.");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");
        }
    }
}
