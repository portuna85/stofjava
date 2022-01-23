package quiz.oop1.ex23;

public class CompareMax {
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -99999;
        }

        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxVal = (maxVal >= arr[i]) ? maxVal : arr[i];
        }
        return maxVal;
    }
}
