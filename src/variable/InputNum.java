package variable;

import java.util.Scanner;

public class InputNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력 : ");
        String str = (String) sc.nextLine();
        int num = Integer.parseInt(str);

        System.out.println(str);
        System.out.println(num);
    }
}
