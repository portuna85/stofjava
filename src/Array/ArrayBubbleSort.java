package Array;

public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arrNum = new int[10];
        int[] cntNum = new int[10];

        for (int i = 0; i < 10; i++) {
            arrNum[i] += (int) (Math.random() * 10);
            System.out.print(arrNum[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrNum.length; i++) {
            cntNum[arrNum[i]]++;
            System.out.print(cntNum[arrNum[i]]++ + " ");
        }
        System.out.println();

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println(i + "의 개수 : " + cntNum[i]);
        }
    }
}
