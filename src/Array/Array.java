package Array;

public class Array{
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = {1,2,3};

        int arrLength = arr1.length;                        // int배열 타입의 arr1 길이 arrLength 대입.

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            System.out.println();
            System.out.println(arr2[i]);
        }
    }
}