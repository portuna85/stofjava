package Array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = {50, 60, 70, 80, 90};
        int k = 1;
        System.out.println(score.length);

        int tmp = score[k + 1] + score[k];
        for (int i = 0; i < score.length; i++) {
            System.out.println(i + " : " + score[i]);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " : " + score[i]);
        }
        System.out.println(tmp);

    }
}
