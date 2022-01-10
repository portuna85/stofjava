package Array;

public class MultiArrEx1 {
    public static void main(String[] args) {
        int[][] score = new int[5][3];
        int num = (int) (Math.random() * 10);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println(score[i][j]);
            }
        }
    }
}