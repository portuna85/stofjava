package Array;

public class ArraySum_Avg {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0f;

        int[] scores = {100, 70, 99, 83, 97};

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = (float) sum/scores.length;
        System.out.println("총점 : " + sum + " 평균 : " + avg);

    }
}
