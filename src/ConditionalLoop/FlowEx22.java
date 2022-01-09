package ConditionalLoop;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int sumEach = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("일반 for문  : " + arr[i] + " ");
        }
        System.out.println();
        System.out.println("일반 for문의 합 : " + sum);
        System.out.println();

        for (int i : arr) {
            System.out.println("향샹된 for문 : " + i);
            sumEach += i;
        }
        System.out.println();
        System.out.println("향샹된 for문의 합 : " + sumEach);
    }
}