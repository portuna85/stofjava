package Array;

import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
        int[] num = new int[10];



        for (int i = 0; i < num.length; i++) {
            num[i] += i;
        }                                       // int[] num = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            int n = (int) (Math.random() * 10) + 1;
            int tmp = num[0];                   // num[0] -> tmp       1 -> tmp
            num[0] = num[n];                    // num[1] -> num[0]
            num[n] = tmp;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}