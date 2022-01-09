package ConditionalLoop;

public class FlowEx29 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.printf("i = %d ", i);

            int tmp = i;
            
            // 3의 배수 면 !!출력
            // 3의 배수가 아니면 그냥 출력
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
                    System.out.print(" 짝");
                }
            } while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}