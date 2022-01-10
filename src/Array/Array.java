package Array;

public class Array {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int length = arr1.length;
        System.out.println(length);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j]);
                System.out.println(arr2[i][j]);
            }
        }
    }
}