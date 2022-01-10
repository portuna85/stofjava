package Array;

import java.util.Arrays;

public class ArrayStringEx1 {
    public static void main(String[] args) {
        String[] strArry = {"가위", "바위", "보"};               // String타입배열 {"가위", "바위", "보"}로 초기화
        System.out.println(Arrays.toString(strArry));          // String타입배열 초기화 내용출력

        // String[0] = 가위, String[1] = 바위, String[2] = 보
        // Math.random() 함수 사용해 0~2 난수 생성 후 tmp 대입
        // strArry[tmp] 출력하면 가위, 바위, 보   난수 출력
        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(strArry[tmp]);
        }
    }
}
