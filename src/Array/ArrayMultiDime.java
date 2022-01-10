package Array;

public class ArrayMultiDime {
    public static void main(String[] args) {
        int[][] scores = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}};
        int sum = 0;

        System.out.println(scores[0][0]);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][i]);
        }

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("[%d, %d] = %d\n", i, j, scores[i][j]);
                sum += scores[i][j];
            }
        }
        System.out.println(sum);
    }
}
