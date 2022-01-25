package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("FILE IO : " + Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2D));    // 이중배열 출력하면 주소값 나옴
        System.out.println(Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, 5);
        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr4 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2 : " + Arrays.toString(arr2));
        System.out.println("arr3 : " + Arrays.toString(arr3));
        System.out.println("arr4 : " + Arrays.toString(arr4));

        int[] arr5 = new int[5];
        Arrays.fill(arr5, 9);
        System.out.println("arr5 : " + Arrays.toString(arr5));

        Arrays.setAll(arr5, i -> (int) (Math.random() * 6 + 1));
        System.out.println("arr5 : " + Arrays.toString(arr5));
    }
}
