package Array;

public class ArrayMax_Min {
    public static void main(String[] args) {
        int[] scores = {90, 97, 88, 56, 99, 37, 79};

        int max = scores[0];
        int min = scores[0];

        // max[0] = 90  >  max[1] = 97 이면 min에 저장 max < scores[i] { max = scores[i] } else { min = scores[i]
        // max[1] = 97  >  max[2] = 88 이면 max에 저장
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i])
                max = scores[i];
            else if(min > scores[i])
                min = scores[i];
        }

        System.out.println("배열의 최대 값 : " + max);
        System.out.println("배열의 최소 값 : " + min);
    }
}