package Operator;

public class OperationEx33 {
    public static void main(String[] args) {
        int num;
        num = 3;
        System.out.println(num);

        num = num + 3;
        System.out.println(num);

        num = 3;
        num += num;                 // num = num + 3 과 동일
        System.out.println(num);
    }
}
