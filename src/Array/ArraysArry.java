package Array;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArraysArry {
    public static void main(String[] args) {
        int[] arr1 = {7, 2, 6, 1, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[][] arr2D = {{1, 2, 3},
                {4, 5, 6,},
                {7, 8, 9}};
        int[][] arr2D1 = {{1, 2, 3},
                {4, 5, 6,},
                {7, 8, 9}};
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.deepEquals(arr2D, arr2D1));

    }
}
