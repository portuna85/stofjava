package Array;

public class ArrayMultiDimeTotal {
    public static void main(String[] args) {
        int kor = 0, eng = 0, math = 0;

        int[][] scores = {{90, 95, 89},
                {92, 61, 99},
                {89, 64, 78},
                {95, 88, 72},
                {99, 87, 77}
        };

        System.out.println("번호  국어  영어   수학 총점  평균");
        System.out.println("==============================");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            float avg = 0.0f;

            kor += scores[i][0];
            eng += scores[i][1];
            math += scores[i][2];
            System.out.printf("%3d", i + 1);

            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                System.out.printf("%5d", scores[i][j]);
            }
            avg = sum / (float) scores[i].length;
            System.out.printf("%5d %5.1f|n", sum, avg);
        }
        System.out.println();
    }
}
