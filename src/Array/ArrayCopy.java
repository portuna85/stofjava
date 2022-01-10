package Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] iArr1 = new int[5];

        for (int i = 0; i < iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        System.out.println(iArr1.length);
        System.out.println(Arrays.toString(iArr1));

        int[] tmp = new int[iArr1.length * 2];
        for (int i = 0; i < iArr1.length; i++) {
            tmp[i] = iArr1[i];
        }

        System.out.println("tmp : " + tmp + "  iArr1 : " + iArr1);
        System.out.println(Arrays.toString(tmp)+ " "+Arrays.toString(iArr1));
    }
}
