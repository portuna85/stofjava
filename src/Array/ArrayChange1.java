package Array;

import java.util.Arrays;

public class ArrayChange1 {
    public static void main(String[] args) {
        int[] balls = new int[45];

        for (int i = 0; i < balls.length; i++) {        // 1~45까지의 숫자를 balls[]배열에 저장
            balls[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;   // 1~45까지의 숫자중 6개 뽑아 num에 저장
            balls[i] = num;
            System.out.println(balls[i]);
        }
    }
}