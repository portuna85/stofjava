package quiz.oop1.ex20;

public class Exercise6_20 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = Suffle.suffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}

class Suffle {
    public static int[] suffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = (int) Math.random() % arr.length;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}