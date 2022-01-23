package quiz.oop1.ex23;

public class Exercise6_23 {
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};

        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 : " + CompareMax.max(data));
        System.out.println("최대값 : " + CompareMax.max(null));
        System.out.println("최대값  : " + CompareMax.max(new int[]{}));    // 크기가 0인 배열
    }
}