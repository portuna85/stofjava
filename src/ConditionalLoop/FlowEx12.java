package ConditionalLoop;

public class FlowEx12 {
    public static void main(String[] args) {
        int i;          // scope(범위) - 선언 위치부터 선언된 블럭의 끝까지

        for (i = 1; i < 10; i++) {
            System.out.println(i);
        }

        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        for (i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
