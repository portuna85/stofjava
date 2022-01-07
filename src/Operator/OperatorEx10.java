package Operator;

public class OperatorEx10 {
    public static void main(String[] args) {
        int num = 100000000;

        int result1 = num * num / num;          // Overloof 발생
        int result2 = num / num * num;

        System.out.println(result1);
        System.out.println(result2);
    }
}
