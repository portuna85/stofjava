package Array;

import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr1 = {100, 95, 90, 80, 70};
        int[] arr2 = {100, 90, 80, 70, 60};
        int[] arr3 = new int[10];
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println("arr3" +Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i + 1;
        }
        System.out.println("arr3" +Arrays.toString(arr3));

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("Arr1 : " + Arrays.toString(arr1));
        System.out.println("Arr2 : " + Arrays.toString(arr2));
        System.out.println("Arr3 : " + Arrays.toString(arr3));

        System.out.println(Arrays.toString(chArr));
    }
}
