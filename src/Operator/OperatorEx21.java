package Operator;

public class OperatorEx21 {
    public static void main(String[] args) {
        float numFl = 15.26823123f;
        int numIn = 17;
        /*
        타입이 다른 변수 비교연산, 논리연산
        float 자료 범위가 넓어서 자동 float 타입으로 변환해 연산.
        */
        System.out.println(numFl == numIn);
        System.out.println(numFl != numIn);

        System.out.println(numFl > numIn);
        System.out.println(numFl < numIn);

        System.out.println(numFl != numIn || numFl > numIn);
        System.out.println(numFl != numIn && numFl > numIn);
    }
}
